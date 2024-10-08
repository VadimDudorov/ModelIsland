package modelIsland.service;

import static modelIsland.repository.AnimalParameters.sizeIsland;

public class Island {
    private Location[] locations = new Location[sizeIsland];
    private static final Island ISLAND = new Island();

    private Island() {
        for (int i = 0; i < locations.length; i++) {
            locations[i] = new Location(i);
        }
    }

    public Location getIdLocations(int id) {
        return locations[id];
    }

    public Location[] getIdLocations() {
        return locations;
    }

    public static Island getIsland() {
        return ISLAND;
    }
}
