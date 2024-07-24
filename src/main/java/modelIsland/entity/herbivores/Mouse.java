package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.mouseParams;

public class Mouse extends Herbivores {
    public Mouse(){
        setWeight(mouseParams[0]);
        setMaxLocation(mouseParams[1]);
        setMaxMove(mouseParams[2]);
        setMaxEat(mouseParams[3]);
    }
}
