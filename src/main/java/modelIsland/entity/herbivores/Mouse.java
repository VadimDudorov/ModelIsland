package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.mouseParamsLocation;

public class Mouse extends Herbivores {
    public Mouse(){
        setWeight(mouseParamsLocation[0]);
        setMaxLocation(mouseParamsLocation[1]);
        setMaxMove(mouseParamsLocation[2]);
        setMaxEat(mouseParamsLocation[3]);
    }
}
