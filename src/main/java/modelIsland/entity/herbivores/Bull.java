package modelIsland.entity.herbivores;

import modelIsland.service.Herbivores;

import static modelIsland.repository.AnimalParameters.bullParamsLocation;
import static modelIsland.repository.AnimalParameters.bullProbability;

public class Bull extends Herbivores {
    public Bull() {
        super(bullParamsLocation[0],
                bullParamsLocation[1],
                bullParamsLocation[2],
                bullParamsLocation[3],
                bullProbability);
    }
}
