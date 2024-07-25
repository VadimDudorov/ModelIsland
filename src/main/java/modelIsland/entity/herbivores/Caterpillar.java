package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.caterpillarParamsLocation;

public class Caterpillar extends Herbivores {
    public Caterpillar(){
        setWeight(caterpillarParamsLocation[0]);
        setMaxLocation(caterpillarParamsLocation[1]);
        setMaxMove(caterpillarParamsLocation[2]);
        setMaxEat(caterpillarParamsLocation[3]);
    }
}
