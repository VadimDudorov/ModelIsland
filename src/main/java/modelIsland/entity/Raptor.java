package modelIsland.entity;

import modelIsland.entity.raptor.*;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;
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

    public Raptor(double weight, double maxLocation, double maxMove, double maxEat, Map<String, Integer> probabilityAnimal) {
        this.weight = weight;
        this.maxLocation = maxLocation;
        this.maxMove = maxMove;
        this.maxEat = maxEat;
        this.probabilityAnimal = probabilityAnimal;
    }

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

    @Override
    public void eat(Location id) {
        int number = UtillitRandom.getRandom(listNameAnimals.size());
        Map<String, Integer> countAnimalLocation = id.countAnimals();
        String foodName = listNameAnimals.get(number);
        Integer countFood = countAnimalLocation.get(foodName);
        if (countFood != null && countFood != 0) {
            int probabilityEating = probabilityAnimal.get(foodName);
            if (probabilityEating != 0 && UtillitRandom.getRandom(101) >= probabilityEating) {
                id.removeAnimal(foodName);
                double weightFood = arraysParametersLocation.get(foodName)[0];
                if (weightFood <= maxEat) {
                    weight = weight + weightFood;
                } else {
                    weight = weight + maxEat;
                }
            } else {
                weight = weight - (weight * 0.10);
            }
        } else {
            weight = weight - (weight * 0.10);
        }
    }

    @Override
    public Location move(Location id) {

        return null;
    }

    @Override
    public void reproduce(Location id) {
        if (gender == 2) {
            return;
        }
        String nameClass = this.getClass().getSimpleName();
        List<? extends Animal> animals = id.getMapsAnimal(nameClass);
        if (!animals.isEmpty()) {
            List<? extends Animal> list = animals.stream().filter(e -> {
                if (e instanceof Raptor raptor) {
                    return raptor.isPair();
                }
                return false;
            }).toList();
            if (!list.isEmpty()) {
                Raptor animal = (Raptor) list.get(0);
                if (id.addAnimal(addReproduce(nameClass))) {
                    animal.setPair(false);
                }
            }
        }
    }

    @Override
    public void dead(Location id) {

    }

    private Animal addReproduce(String name) {
        RuntimeException runtimeException = new RuntimeException();
        return switch (name) {
            case "Wolf" -> new Wolf();
            case "Boa" -> new Boa();
            case "Fox" -> new Fox();
            case "Eagle" -> new Eagle();
            case "Bear" -> new Bear();
            default -> throw runtimeException;
        };
    }
}
