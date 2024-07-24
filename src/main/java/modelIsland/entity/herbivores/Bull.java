package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.bullParams;

public class Bull extends Herbivores {
    public Bull(){
        setWeight(bullParams[0]);
        setMaxLocation(bullParams[1]);
        setMaxMove(bullParams[2]);
        setMaxEat(bullParams[3]);
    }
}
