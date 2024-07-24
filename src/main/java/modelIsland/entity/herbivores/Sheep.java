package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.sheepParams;

public class Sheep extends Herbivores {
    public Sheep(){
        setWeight(sheepParams[0]);
        setMaxLocation(sheepParams[1]);
        setMaxMove(sheepParams[2]);
        setMaxEat(sheepParams[3]);
    }
}
