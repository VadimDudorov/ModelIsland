package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.rabbitParamsLocation;

public class Rabbit extends Herbivores {
    public Rabbit(){
        setWeight(rabbitParamsLocation[0]);
        setMaxLocation(rabbitParamsLocation[1]);
        setMaxMove(rabbitParamsLocation[2]);
        setMaxEat(rabbitParamsLocation[3]);
    }
}
