package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.bearParams;

public class Bear extends Raptor {
    public Bear(){
        setWeight(bearParams[0]);
        setMaxLocation(bearParams[1]);
        setMaxMove(bearParams[2]);
        setMaxEat(bearParams[3]);
    }
}
