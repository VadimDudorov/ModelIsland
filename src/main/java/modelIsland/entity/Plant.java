package modelIsland.entity;

import modelIsland.service.Location;

public class Plant implements Animal {
    //TODO реализовать логику для растений
    private int weight;
    private int maxLocation;

    public double getWeight() {
        return weight;
    }

    public int getMaxLocation() {
        return maxLocation;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxLocation(int maxLocation) {
        this.maxLocation = maxLocation;
    }

    @Override
    public void eat(Location id) {

    }

    @Override
    public Location move(Location id) {
        return null;
    }

    @Override
    public void reproduce(Location id) {
    }

    @Override
    public boolean dead(Location id) {
    return false;
    }
}
