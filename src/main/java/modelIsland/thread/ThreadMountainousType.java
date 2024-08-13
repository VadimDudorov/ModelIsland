package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadMountainousType extends ThreadType {
    private static final String NAME_TYPE = "MountainousType";

    public ThreadMountainousType(Location[] countLocation) {
        super(countLocation, NAME_TYPE);
    }
}
