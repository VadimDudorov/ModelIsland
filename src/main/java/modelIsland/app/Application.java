package modelIsland.app;

import modelIsland.controller.MainController;
import modelIsland.service.Island;
import modelIsland.service.Location;
import modelIsland.thread.ThreadDesertType;
import modelIsland.thread.ThreadMountainousType;
import modelIsland.thread.ThreadPlainType;
import modelIsland.thread.ThreadWoodlandType;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    private MainController mainController;
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
    private Location[] desertArrays;
    private Location[] mountainousArrays;
    private Location[] plainArrays;
    private Location[] woodlandArrays;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public void run() {
        divisionArray(Island.getIsland().getIdLocations());
        List<Runnable> runnableList = List.of(
                new ThreadDesertType(desertArrays, mainController),
                new ThreadMountainousType(mountainousArrays, mainController),
                new ThreadPlainType(plainArrays, mainController),
                new ThreadWoodlandType(woodlandArrays, mainController)
        );
        for (Runnable runnable : runnableList) {
            scheduledExecutorService.scheduleWithFixedDelay(runnable, 1, 1, TimeUnit.SECONDS);
        }

        while (true) {
            if (mainController.getView().isStop()) {
                System.out.println("Останавливаем сервис");
                scheduledExecutorService.shutdown();
                break;
            }
        }
    }

    private void divisionArray(Location[] locations) {
        if (locations.length % 4 != 0) {
            System.out.println("Array cannot be evenly divided into 4 parts.");
            return;
        }
        int partSize = locations.length / 4;
        desertArrays = new Location[partSize];
        mountainousArrays = new Location[partSize];
        plainArrays = new Location[partSize];
        woodlandArrays = new Location[partSize];
        for (int i = 0; i < partSize; i++) {
            desertArrays[i] = locations[i];
            mountainousArrays[i] = locations[i + partSize];
            plainArrays[i] = locations[i + 2 * partSize];
            woodlandArrays[i] = locations[i + 3 * partSize];
        }
    }
}
