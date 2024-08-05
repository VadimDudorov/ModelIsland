package modelIsland.app;

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
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
    private Location[] desertArrays;
    private Location[] mountainousArrays;
    private Location[] plainArrays;
    private Location[] woodlandArrays;

    public void run() {
        divisionArray(Island.getIsland().getIdLocations());
        List<Runnable> runnableList = List.of(
                new ThreadDesertType(desertArrays),
                new ThreadMountainousType(mountainousArrays),
                new ThreadPlainType(plainArrays),
                new ThreadWoodlandType(woodlandArrays)
        );
        for (Runnable runnable : runnableList) {
            scheduledExecutorService.scheduleWithFixedDelay(runnable, 1, 2, TimeUnit.SECONDS);
        }

        try {
            if (!scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Останавливаем сервис");
                scheduledExecutorService.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Executor сервис завершился не корректно",e);
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
