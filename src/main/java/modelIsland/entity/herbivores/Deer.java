package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.deerParams;

public class Deer extends Herbivores {
    public Deer(){
        setWeight(deerParams[0]);
        setMaxLocation(deerParams[1]);
        setMaxMove(deerParams[2]);
        setMaxEat(deerParams[3]);
    }
}
