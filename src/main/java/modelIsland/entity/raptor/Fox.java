package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.foxParamsLocation;

public class Fox extends Raptor {
    public Fox(){
        setWeight(foxParamsLocation[0]);
        setMaxLocation(foxParamsLocation[1]);
        setMaxMove(foxParamsLocation[2]);
        setMaxEat(foxParamsLocation[3]);
    }
}
