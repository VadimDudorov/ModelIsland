package modelIsland.entity;

public abstract class Herbivores implements Animal {
    private double weight;
    private double maxLocation;
    private double maxMove;
    private double maxEat;

    public double getWeight() {
        return weight;
    }

    public double getMaxLocation() {
        return maxLocation;
    }

    public double getMaxMove() {
        return maxMove;
    }

    public double getMaxEat() {
        return maxEat;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxLocation(double maxLocation) {
        this.maxLocation = maxLocation;
    }

    public void setMaxMove(double maxMove) {
        this.maxMove = maxMove;
    }

    public void setMaxEat(double maxEat) {
        this.maxEat = maxEat;
    }

    @Override
    public void eat(Location id) {

    }

    @Override
    public Location move(Location id) {
        return null;
    }

    @Override
    public Animal reproduce(Animal pair,Location id) {
        return null;
    }

    @Override
    public void dead(Location id) {

    }
}
