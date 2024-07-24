package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.goatParams;

public class Goat extends Herbivores {
    public Goat(){
        setWeight(goatParams[0]);
        setMaxLocation(goatParams[1]);
        setMaxMove(goatParams[2]);
        setMaxEat(goatParams[3]);
    }
}
