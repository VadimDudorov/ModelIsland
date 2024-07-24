package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.rabbitParams;

public class Rabbit extends Herbivores {
    public Rabbit(){
        setWeight(rabbitParams[0]);
        setMaxLocation(rabbitParams[1]);
        setMaxMove(rabbitParams[2]);
        setMaxEat(rabbitParams[3]);
    }
}
