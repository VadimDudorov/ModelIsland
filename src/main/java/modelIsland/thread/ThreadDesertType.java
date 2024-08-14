package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;

public class ThreadDesertType extends ThreadType implements Runnable {
    private static final String NAME_TYPE = "DesertType";

    public ThreadDesertType(Location[] countLocation, MainController mainController) {
        super(countLocation, NAME_TYPE, mainController);
    }
}
