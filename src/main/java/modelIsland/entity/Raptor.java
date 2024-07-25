package modelIsland.entity;

import modelIsland.utilityClass.UtillitRandom;

import java.util.Map;

import static modelIsland.repository.AnimalParameters.arraysParametersLocation;
import static modelIsland.repository.AnimalParameters.listNameAnimals;

public abstract class Raptor implements Animal {
    private double weight;
    private double maxLocation;
    private double maxMove;
    private double maxEat;
    private int gender = UtillitRandom.getRandom(2);
    private boolean pair;
    private Map<String, Integer> probabilityAnimal;

    public boolean isPair() {
        return pair;
    }

    public void setPair(boolean pair) {
        this.pair = pair;
    }

    public int getGender() {
        return gender;
    }

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
    public void eat(Animal food, Location id) {
        int number = UtillitRandom.getRandom(listNameAnimals.size());
        Map<String, Integer> countAnimalLocation = id.countAnimals();
        String foodName = listNameAnimals.get(number);
        Integer countFood = countAnimalLocation.get(foodName);
        if (countFood != null && countFood != 0) {
            int probabilityEating = probabilityAnimal.get(foodName);
            if (probabilityEating != 0 && UtillitRandom.getRandom(101) >= probabilityEating) {
                id.removeAnimal(food);
                double weightFood = arraysParametersLocation.get(foodName)[0];
                if (weightFood <= maxEat) {
                    setWeight(this.weight + weightFood);
                } else {
                    setWeight(this.weight + maxEat);
                }
            } else {
                setWeight(getWeight() - (weight * 0.10));
            }
        } else {
            setWeight(getWeight() - (weight * 0.10));
        }
    }

    @Override
    public Location move(Location id) {

        return null;
    }

    @Override
    public Animal reproduce(Animal pair, Location id) {
        return null;
    }

    @Override
    public void dead(Location id) {

    }
}
