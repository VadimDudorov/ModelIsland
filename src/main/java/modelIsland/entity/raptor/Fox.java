package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.foxParams;

public class Fox extends Raptor {
    public Fox(){
        setWeight(foxParams[0]);
        setMaxLocation(foxParams[1]);
        setMaxMove(foxParams[2]);
        setMaxEat(foxParams[3]);
    }
}
