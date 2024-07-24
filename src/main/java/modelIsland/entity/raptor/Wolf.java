package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.wolfParams;

public class Wolf extends Raptor {
    public Wolf(){
        setWeight(wolfParams[0]);
        setMaxLocation(wolfParams[1]);
        setMaxMove(wolfParams[2]);
        setMaxEat(wolfParams[3]);
    }
}
