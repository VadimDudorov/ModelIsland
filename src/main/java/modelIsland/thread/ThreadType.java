package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;
import modelIsland.view.View;

import java.util.HashMap;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.nameAnimals;

public abstract class ThreadType implements Runnable {
    private final Location[] countLocation;
    private final String nameType;
    private final View view;

    public ThreadType(Location[] countLocation, String nameType, MainController mainController) {
        this.countLocation = countLocation;
        this.nameType = nameType;
        view = mainController.getView();
    }

    @Override
    public void run() {
        for (Location location : countLocation) {
            location.lifeCycle();
        }
        for (String name : nameAnimals) {
            view.changeType(nameType, name, locationStatistics().get(name));
        }
    }

    public Map<String, Integer> locationStatistics() {
        Map<String, Integer> mapStatistics = new HashMap<>();
        for (Location location : countLocation) {
            for (String nameAnimal : nameAnimals) {
                int size = location.countAnimals(nameAnimal).size();
                if (mapStatistics.containsKey(nameAnimal)) {
                    int sizeMap = mapStatistics.get(nameAnimal) + size;
                    mapStatistics.put(nameAnimal, sizeMap);
                } else {
                    mapStatistics.put(nameAnimal, location.countAnimals(nameAnimal).size());
                }
            }
        }
        return mapStatistics;
    }
}
