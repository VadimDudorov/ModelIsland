package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadWoodlandType extends ThreadType {
    private static final String NAME_TYPE = "WoodlandType";

    public ThreadWoodlandType(Location[] countLocation) {
        super(countLocation, NAME_TYPE);
    }
}
