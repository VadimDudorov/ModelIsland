package modelIsland.service;

import modelIsland.entity.Animal;
import modelIsland.entity.herbivores.*;
import modelIsland.repository.AnimalParameters;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static modelIsland.repository.AnimalParameters.*;

public abstract class Herbivores implements Animal {
    private int idObject = AnimalParameters.idObject++;
    private double weight;
    private double maxLocation;
    private double maxMove;
    private double maxEat;
    private int gender = UtillitRandom.getRandom(2) + 1;
    private boolean pair = true;
    private Map<String, Integer> probabilityAnimal;
    private String nameClass = this.getClass().getSimpleName();

    public Herbivores(double weight,
                      double maxLocation,
                      double maxMove,
                      double maxEat,
                      Map<String, Integer> probabilityAnimal) {
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

    public Map<String, Integer> getProbabilityAnimal() {
        return probabilityAnimal;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        int number = UtillitRandom.getRandom(2) + 1;
        if (number == 2) {
            weight = weight - (weight * lossWeight);
            return;
        }
        String foodName = nameAnimals[15];
        List<? extends Animal> animalsList = id.countAnimals(foodName);
        if (!animalsList.isEmpty()) {
            Animal animalFoodObject = animalsList.get(0);
            id.removeAnimal(foodName, animalFoodObject);
            double weightFood = animalFoodObject.getWeight();
            if (weightFood <= maxEat) {
                weight = weight + weightFood;
            } else {
                weight = weight + maxEat;
            }
        } else {
            weight = weight - (weight * lossWeight);
        }
    }

    @Override
    public Location move(Location id) {
        int goLocation;
        int acceptableCountSteps = (int) arraysParametersLocation.get(nameClass)[2];
        int resultMoveSteps = UtillitRandom.getRandom(acceptableCountSteps) + 1;
        int whatDirection = UtillitRandom.getRandom(4) + 1;
        int idMoveLocation = switch (whatDirection) {
            case 1 -> {
                goLocation = id.getIdLocation() - resultMoveSteps;
                if (goLocation >= 0) {
                    yield goLocation;
                } else {
                    yield -1;
                }
            }
            case 2 -> {
                goLocation = id.getIdLocation() + (resultMoveSteps * HEIGHT_ISLAND);
                if (goLocation <= sizeIsland) {
                    yield goLocation;
                } else {
                    yield -1;
                }
            }
            case 3 -> {
                goLocation = id.getIdLocation() + resultMoveSteps;
                if (goLocation <= sizeIsland) {
                    yield goLocation;
                } else {
                    yield -1;
                }
            }
            case 4 -> {
                goLocation = id.getIdLocation() - (resultMoveSteps * HEIGHT_ISLAND);
                if (goLocation >= 0) {
                    yield goLocation;
                } else {
                    yield -1;
                }
            }
            default -> -1;
        };
        if (idMoveLocation >= 0 && idMoveLocation < sizeIsland) {
            Location moveLocation = Island.getIsland().getIdLocations(idMoveLocation);
            if (moveLocation.addAnimal(this)) {
                id.removeAnimal(nameClass, this);
                if (!this.isPair()) {
                    pair = true;
                }
                return moveLocation;
            }
        }
        return null;
    }

    @Override
    public void reproduce(Location id) {
        if (gender == 2) {
            return;
        }
        List<? extends Animal> animalsList = id.countAnimals(nameClass);
        if (!animalsList.isEmpty()) {
            List<Herbivores> listPair = animalsList.stream().map(e -> (Herbivores) e).filter(e -> e.getGender() == 2)
                    .filter(Herbivores::isPair).toList();
            if (!listPair.isEmpty()) {
                Herbivores animalPair = listPair.get(0);
                if (id.addAnimal(addReproduce(nameClass))) {
                    animalPair.setPair(false);
                }
            }
        }
    }

    @Override
    public boolean dead(Location id) {
        double expectedWeight = arraysParametersLocation.get(nameClass)[0] * levelLife;
        if (this.weight <= expectedWeight) {
            id.removeAnimal(nameClass, this);
            return true;
        }
        return false;
    }

    private Animal addReproduce(String name) {
        return switch (name) {
            case "Bull" -> new Bull();
            case "Caterpillar" -> new Caterpillar();
            case "Deer" -> new Deer();
            case "Duck" -> new Duck();
            case "Goat" -> new Goat();
            case "Hog" -> new Hog();
            case "Horse" -> new Horse();
            case "Mouse" -> new Mouse();
            case "Rabbit" -> new Rabbit();
            case "Sheep" -> new Sheep();
            default -> throw new RuntimeException("При создании объекта Herbivores не найден подходящий класс");
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return idObject == that.idObject;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idObject);
    }
}
