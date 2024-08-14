package modelIsland.thread;

import modelIsland.controller.MainController;
import modelIsland.service.Location;

public class ThreadPlainType extends ThreadType {
    private static final String NAME_TYPE = "PlainType";

    public ThreadPlainType(Location[] countLocation, MainController mainController) {
        super(countLocation, NAME_TYPE, mainController);
    }
}
