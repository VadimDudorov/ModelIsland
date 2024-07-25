package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.goatParamsLocation;

public class Goat extends Herbivores {
    public Goat(){
        setWeight(goatParamsLocation[0]);
        setMaxLocation(goatParamsLocation[1]);
        setMaxMove(goatParamsLocation[2]);
        setMaxEat(goatParamsLocation[3]);
    }
}
