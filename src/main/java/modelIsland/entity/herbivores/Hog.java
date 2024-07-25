package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.hogParamsLocation;

public class Hog extends Herbivores {
    public Hog(){
        setWeight(hogParamsLocation[0]);
        setMaxLocation(hogParamsLocation[1]);
        setMaxMove(hogParamsLocation[2]);
        setMaxEat(hogParamsLocation[3]);
    }
}
