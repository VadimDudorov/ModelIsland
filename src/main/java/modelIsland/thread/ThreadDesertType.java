package modelIsland.thread;

import modelIsland.service.Location;

public class ThreadDesertType implements Runnable {
    Location[] countLocation;

    public ThreadDesertType(Location[] countLocation) {
        this.countLocation = countLocation;
    }

    @Override
    public void run() {
        for (int i = 0; i < countLocation.length; i++) {
            System.out.println("До = " + countLocation[i].toString());
            countLocation[i].lifeCycle();
            System.out.println("После = " + countLocation[i].toString());
        }
    }
}
