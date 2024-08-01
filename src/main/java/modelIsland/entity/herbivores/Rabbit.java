package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.rabbitParamsLocation;
import static modelIsland.repository.AnimalParameters.rabbitProbability;

public class Rabbit extends Herbivores {
    public Rabbit() {
        super(rabbitParamsLocation[0],
                rabbitParamsLocation[1],
                rabbitParamsLocation[2],
                rabbitParamsLocation[3],
                rabbitProbability);
    }
}
