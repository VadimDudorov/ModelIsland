package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;

public class ThreadMountainousType extends ThreadType {
    private static final String NAME_TYPE = "MountainousType";

    public ThreadMountainousType(Location[] countLocation, MainController mainController) {
        super(countLocation, NAME_TYPE, mainController);
    }
}
