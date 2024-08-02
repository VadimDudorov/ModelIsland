package modelIsland.thread;

import modelIsland.service.Island;

public class ThreadMountainousType extends Thread{
    int countLocation;
    public ThreadMountainousType(int countLocation){
        this.countLocation = countLocation;
    }
    @Override
    public void run() {
        for (int i = 1; i <= countLocation; i++) {
            Island.getIsland().getIdLocations(i).lifeCycle();
        }
    }
}
