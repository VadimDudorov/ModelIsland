package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.eagleParamsLocation;

public class Eagle extends Raptor {
    public Eagle(){
        setWeight(eagleParamsLocation[0]);
        setMaxLocation(eagleParamsLocation[1]);
        setMaxMove(eagleParamsLocation[2]);
        setMaxEat(eagleParamsLocation[3]);
    }
}
