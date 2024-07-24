package modelIsland.entity;

public abstract class Raptor implements Animal {
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
