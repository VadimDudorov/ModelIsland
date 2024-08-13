package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadPlainType extends ThreadType {
    private static final String NAME_TYPE = "PlainType";

    public ThreadPlainType(Location[] countLocation) {
        super(countLocation, NAME_TYPE);
    }
}
