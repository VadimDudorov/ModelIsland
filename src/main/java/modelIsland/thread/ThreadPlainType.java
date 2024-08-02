package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadPlainType extends Thread {
    Location[] countLocation;

    public ThreadPlainType(Location[] countLocation) {
        this.countLocation = countLocation;
    }

    @Override
    public void run() {
        for (int i = 0; i < countLocation.length; i++) {
            countLocation[i].lifeCycle();
        }
    }
}
