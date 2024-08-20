package modelIsland.entity.raptor;

import modelIsland.service.Raptor;

import static modelIsland.repository.AnimalParameters.foxParamsLocation;
import static modelIsland.repository.AnimalParameters.foxProbability;

public class Fox extends Raptor {
    public Fox() {
        super(foxParamsLocation[0], foxParamsLocation[1], foxParamsLocation[2], foxParamsLocation[3], foxProbability);
    }
}
