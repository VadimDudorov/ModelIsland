package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.eagleParams;

public class Eagle extends Raptor {
    public Eagle(){
        setWeight(eagleParams[0]);
        setMaxLocation(eagleParams[1]);
        setMaxMove(eagleParams[2]);
        setMaxEat(eagleParams[3]);
    }
}
