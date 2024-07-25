package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.bearParamsLocation;

public class Bear extends Raptor {
    public Bear(){
        setWeight(bearParamsLocation[0]);
        setMaxLocation(bearParamsLocation[1]);
        setMaxMove(bearParamsLocation[2]);
        setMaxEat(bearParamsLocation[3]);
    }
}
