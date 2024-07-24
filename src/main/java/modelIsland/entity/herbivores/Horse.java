package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.horseParams;

public class Horse extends Herbivores {
    public Horse(){
        setWeight(horseParams[0]);
        setMaxLocation(horseParams[1]);
        setMaxMove(horseParams[2]);
        setMaxEat(horseParams[3]);
    }
}
