package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadDesertType extends ThreadType implements Runnable {
    private static final String NAME_TYPE = "DesertType";

    public ThreadDesertType(Location[] countLocation) {
        super(countLocation, NAME_TYPE);
    }
}
