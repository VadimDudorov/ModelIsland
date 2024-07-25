package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.duckParamsLocation;

public class Duck extends Herbivores {
    public Duck(){
        setWeight(duckParamsLocation[0]);
        setMaxLocation(duckParamsLocation[1]);
        setMaxMove(duckParamsLocation[2]);
        setMaxEat(duckParamsLocation[3]);
    }
}
