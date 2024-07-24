package modelIsland.entity;

public class Plant implements Animal{
    private int weight;
    private int maxLocation;

    public int getWeight() {
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
    public void eat(Animal food) {

    }

    @Override
    public Location move() {
        return null;
    }

    @Override
    public Animal reproduce(Animal pair) {
        return null;
    }

    @Override
    public void dead() {

    }
}
