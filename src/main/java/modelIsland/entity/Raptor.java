package modelIsland.entity;

import modelIsland.entity.raptor.*;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.*;

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
        String foodName = listNameAnimals.get(number);
        List<? extends Animal> animalsList = id.countAnimals(foodName);
        if (!animalsList.isEmpty()) {
            int probabilityEating = probabilityAnimal.get(foodName);
            if (probabilityEating != 0 && UtillitRandom.getRandom(101) >= probabilityEating) {
                Animal animalFoodObject = animalsList.get(0);
                id.removeAnimal(foodName, animalFoodObject);
                double weightFood = animalFoodObject.getWeight();
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
        int goLocation;
        String nameClass = this.getClass().getSimpleName();
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
        if (idMoveLocation >= 0) {
            Location moveLocation = Island.getIsland().getIdLocations(idMoveLocation);
            if (moveLocation.addAnimal(this)) {
                id.removeAnimal(nameClass, this);
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
        String nameClass = this.getClass().getSimpleName();
        List<? extends Animal> animalsList = id.countAnimals(nameClass);
        if (!animalsList.isEmpty()) {
            List<Raptor> listPair = animalsList.stream().map(e -> (Raptor) e).filter(Raptor::isPair).toList();
            if (!listPair.isEmpty()) {
                Raptor animalPair = listPair.get(0);
                if (id.addAnimal(addReproduce(nameClass))) {
                    animalPair.setPair(false);
                }
            }
        }
    }

    @Override
    public void dead(Location id) {
        double expectedWeight = this.weight * 0.25;
        if (this.weight <= expectedWeight) {
            id.removeAnimal(this.getClass().getSimpleName(), this);
        }

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
