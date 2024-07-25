package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.bullParamsLocation;

public class Bull extends Herbivores {
    public Bull(){
        setWeight(bullParamsLocation[0]);
        setMaxLocation(bullParamsLocation[1]);
        setMaxMove(bullParamsLocation[2]);
        setMaxEat(bullParamsLocation[3]);
    }
}
