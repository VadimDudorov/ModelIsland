package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadWoodlandType implements Runnable {
    Location[] countLocation;

    public ThreadWoodlandType(Location[] countLocation) {
        this.countLocation = countLocation;
    }

    @Override
    public void run() {
        for (int i = 0; i < countLocation.length; i++) {
            countLocation[i].lifeCycle();
            System.out.println(countLocation[i].toString());
        }
    }
}
