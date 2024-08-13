package modelIsland.thread;

import modelIsland.service.Location;

import java.util.HashMap;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.nameAnimals;

public abstract class ThreadType implements Runnable{
    private Location[] countLocation;
    private String nameType;

    public ThreadType(Location[] countLocation, String nameType) {
        this.countLocation = countLocation;
        this.nameType = nameType;
    }

    @Override
    public void run() {
        for (int i = 0; i < countLocation.length; i++) {
            System.out.println("Локация: " + nameType + " До = " + locationStatistics());
            countLocation[i].lifeCycle();
            System.out.println("Локация: " + nameType + " После = " + locationStatistics());
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
