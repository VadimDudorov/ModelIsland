package modelIsland.entity.raptor;

import modelIsland.service.Raptor;

import static modelIsland.repository.AnimalParameters.bearParamsLocation;
import static modelIsland.repository.AnimalParameters.bearProbability;

public class Bear extends Raptor {
    public Bear() {
        super(bearParamsLocation[0],
                bearParamsLocation[1],
                bearParamsLocation[2],
                bearParamsLocation[3],
                bearProbability);
    }
}
