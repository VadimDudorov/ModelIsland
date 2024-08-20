package modelIsland.entity.herbivores;

import modelIsland.service.Herbivores;

import static modelIsland.repository.AnimalParameters.horseParamsLocation;
import static modelIsland.repository.AnimalParameters.horseProbability;

public class Horse extends Herbivores {
    public Horse() {
        super(horseParamsLocation[0],
                horseParamsLocation[1],
                horseParamsLocation[2],
                horseParamsLocation[3],
                horseProbability);
    }
}
