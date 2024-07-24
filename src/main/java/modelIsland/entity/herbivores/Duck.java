package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.duckParams;

public class Duck extends Herbivores {
    public Duck(){
        setWeight(duckParams[0]);
        setMaxLocation(duckParams[1]);
        setMaxMove(duckParams[2]);
        setMaxEat(duckParams[3]);
    }
}
