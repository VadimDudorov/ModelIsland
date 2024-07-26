package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.wolfParamsLocation;
import static modelIsland.repository.AnimalParameters.wolfProbability;

public class Wolf extends Raptor {
    public Wolf() {
        super(wolfParamsLocation[0],
                wolfParamsLocation[1],
                wolfParamsLocation[2],
                wolfParamsLocation[3],
                wolfProbability);
    }
}
