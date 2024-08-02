package modelIsland.app;

import modelIsland.service.Island;
import modelIsland.service.Location;
import modelIsland.thread.ThreadDesertType;
import modelIsland.thread.ThreadMountainousType;
import modelIsland.thread.ThreadPlainType;
import modelIsland.thread.ThreadWoodlandType;

public class Application {
    private Location[] desertArrays;
    private Location[] mountainousArrays;
    private Location[] plainArrays;
    private Location[] woodlandArrays;

    public void run() {
        divisionArray(Island.getIsland().getIdLocations());
        ThreadDesertType threadDesertType = new ThreadDesertType(desertArrays);
        ThreadMountainousType threadMountainousType = new ThreadMountainousType(mountainousArrays);
        ThreadPlainType threadPlainType = new ThreadPlainType(plainArrays);
        ThreadWoodlandType threadWoodlandType = new ThreadWoodlandType(woodlandArrays);
        threadDesertType.start();
        threadMountainousType.start();
        threadPlainType.start();
        threadWoodlandType.start();
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
