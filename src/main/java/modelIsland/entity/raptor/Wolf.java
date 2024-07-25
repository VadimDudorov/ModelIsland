package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.wolfParamsLocation;

public class Wolf extends Raptor {
    public Wolf(){
        setWeight(wolfParamsLocation[0]);
        setMaxLocation(wolfParamsLocation[1]);
        setMaxMove(wolfParamsLocation[2]);
        setMaxEat(wolfParamsLocation[3]);
    }
}
