package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.sheepParamsLocation;

public class Sheep extends Herbivores {
    public Sheep(){
        setWeight(sheepParamsLocation[0]);
        setMaxLocation(sheepParamsLocation[1]);
        setMaxMove(sheepParamsLocation[2]);
        setMaxEat(sheepParamsLocation[3]);
    }
}
