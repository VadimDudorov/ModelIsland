package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.deerParamsLocation;

public class Deer extends Herbivores {
    public Deer(){
        setWeight(deerParamsLocation[0]);
        setMaxLocation(deerParamsLocation[1]);
        setMaxMove(deerParamsLocation[2]);
        setMaxEat(deerParamsLocation[3]);
    }
}
