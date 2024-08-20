package modelIsland.entity.herbivores;

import modelIsland.service.Herbivores;

import static modelIsland.repository.AnimalParameters.sheepParamsLocation;
import static modelIsland.repository.AnimalParameters.sheepProbability;

public class Sheep extends Herbivores {
    public Sheep() {
        super(sheepParamsLocation[0],
                sheepParamsLocation[1],
                sheepParamsLocation[2],
                sheepParamsLocation[3],
                sheepProbability);
    }
}
