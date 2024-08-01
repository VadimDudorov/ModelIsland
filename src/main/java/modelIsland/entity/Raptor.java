package modelIsland.entity;

import modelIsland.service.Island;
import modelIsland.service.Location;
import modelIsland.entity.raptor.*;
import modelIsland.repository.AnimalParameters;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static modelIsland.repository.AnimalParameters.*;

public abstract class Raptor implements Animal {
    private int idObject = AnimalParameters.idObject++;
    private double weight;
    private double maxLocation;
    private double maxMove;
    private double maxEat;
    private int gender = UtillitRandom.getRandom(2);
    private boolean pair;
    private Map<String, Integer> probabilityAnimal;
    private String nameClass = this.getClass().getSimpleName();

    public Raptor(double weight,
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
        int number = UtillitRandom.getRandom(nameAnimals.length);
        String foodName = listNameAnimals.get(number);
        List<? extends Animal> animalsList = id.countAnimals(foodName);
        if (!animalsList.isEmpty()) {
            int probabilityEating = probabilityAnimal.get(foodName);
            if (probabilityEating != 0 && UtillitRandom.getRandom(101) <= probabilityEating) {
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
        if (idMoveLocation >= 0) {
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
        double expectedWeight = arraysParametersLocation.get(nameClass)[0] * levelLife;
        if (this.weight <= expectedWeight) {
            id.removeAnimal(nameClass, this);
        }
    }

    private Animal addReproduce(String name) {
        return switch (name) {
            case "Wolf" -> new Wolf();
            case "Boa" -> new Boa();
            case "Fox" -> new Fox();
            case "Eagle" -> new Eagle();
            case "Bear" -> new Bear();
            default -> throw new RuntimeException("При создании объекта Raptor не найден подходящий класс");
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raptor raptor = (Raptor) o;
        return idObject == raptor.idObject;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idObject);
    }
}


