package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.caterpillarParams;

public class Caterpillar extends Herbivores {
    public Caterpillar(){
        setWeight(caterpillarParams[0]);
        setMaxLocation(caterpillarParams[1]);
        setMaxMove(caterpillarParams[2]);
        setMaxEat(caterpillarParams[3]);
    }
}
