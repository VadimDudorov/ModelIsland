package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;
import modelIsland.view.View;

import java.util.HashMap;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.nameAnimals;

public abstract class ThreadType implements Runnable {
    private Location[] countLocation;
    private String nameType;
    private MainController mainController;
    private Map<String, Integer> countAnimals;
    private View view;

    public ThreadType(Location[] countLocation, String nameType, MainController mainController) {
        this.countLocation = countLocation;
        this.nameType = nameType;
        this.mainController = mainController;
        view = mainController.getView();
    }

    @Override
    public void run() {
        for (int i = 0; i < countLocation.length; i++) {
            countLocation[i].lifeCycle();
        }
        for (String name : nameAnimals) {
            view.changeType(nameType, name, locationStatistics().get(name));
        }
    }

    public Map<String, Integer> locationStatistics() {
        Map<String, Integer> mapStatistics = new HashMap<>();
        for (int i = 0; i < countLocation.length; i++) {
            for (int j = 0; j < nameAnimals.length; j++) {
                int size = countLocation[i].countAnimals(nameAnimals[j]).size();
                if (mapStatistics.containsKey(nameAnimals[j])) {
                    int sizeMap = mapStatistics.get(nameAnimals[j]) + size;
                    mapStatistics.put(nameAnimals[j], sizeMap);
                } else {
                    mapStatistics.put(nameAnimals[j], countLocation[i].countAnimals(nameAnimals[j]).size());
                }
            }
        }
        return mapStatistics;
    }
}
