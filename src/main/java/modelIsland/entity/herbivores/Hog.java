package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.hogParams;

public class Hog extends Herbivores {
    public Hog(){
        setWeight(hogParams[0]);
        setMaxLocation(hogParams[1]);
        setMaxMove(hogParams[2]);
        setMaxEat(hogParams[3]);
    }
}
