package modelIsland.entity;

public class Island {
   private Location[] locations = new Location[2000];
   private static final Island ISLAND = new Island();
    private Island(){
        for (int i = 0; i < locations.length; i++) {
            locations[i] = new Location();
        }
    }

    public Location[] getLocations() {
        return locations;
    }
    public static Island getIsland(){
        return ISLAND;
    }
}
