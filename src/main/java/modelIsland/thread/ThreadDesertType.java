package modelIsland.thread;

import modelIsland.service.Location;

import java.util.List;

public class ThreadDesertType extends Thread{
    List<Location> countLocation;
    public ThreadDesertType(List<Location> countLocation){
        this.countLocation = countLocation;
    }
    @Override
    public void run() {
        for (Location location : countLocation){
            location.lifeCycle();
        }
    }
}
