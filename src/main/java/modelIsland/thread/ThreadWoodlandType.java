package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;

public class ThreadWoodlandType extends ThreadType {
    private static final String NAME_TYPE = "WoodlandType";

    public ThreadWoodlandType(Location[] countLocation, MainController mainController) {
        super(countLocation, NAME_TYPE, mainController);
    }
}
