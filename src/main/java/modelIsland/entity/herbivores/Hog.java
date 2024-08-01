package modelIsland.entity.herbivores;

import modelIsland.entity.Animal;
import modelIsland.entity.Herbivores;
import modelIsland.service.Location;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;

import static modelIsland.repository.AnimalParameters.*;
import static modelIsland.repository.AnimalParameters.lossWeight;

public class Hog extends Herbivores {
    public Hog() {
        super(hogParamsLocation[0],
                hogParamsLocation[1],
                hogParamsLocation[2],
                hogParamsLocation[3],
                hogProbability);
    }

    @Override
    public void eat(Location id) {
        double weight = getWeight();
        int number = UtillitRandom.getRandom(4) + 1;
        if (number == 4) {
            setWeight(weight - (weight * lossWeight));
            return;
        }
        String foodName = switch (number) {
            case 1 -> "Mouse";
            case 2 -> "Caterpillar";
            case 3 -> "Plant";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
        List<? extends Animal> animalsList = id.countAnimals(foodName);
        if (!animalsList.isEmpty()) {
            int probabilityEating = getProbabilityAnimal().get(foodName);
            if (probabilityEating != 0 && UtillitRandom.getRandom(101) <= probabilityEating) {
                Animal animalFoodObject = animalsList.get(0);
                id.removeAnimal(foodName, animalFoodObject);
                double weightFood = animalFoodObject.getWeight();
                if (weightFood <= getMaxEat()) {
                    setWeight(weight + weightFood);
                } else {
                    setWeight(weight + getMaxEat());
                }
            } else {
                setWeight(weight - (weight * lossWeight));
            }
        } else {
            setWeight(weight - (weight * lossWeight));
        }
    }
}
