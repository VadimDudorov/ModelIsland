package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.horseParamsLocation;

public class Horse extends Herbivores {
    public Horse(){
        setWeight(horseParamsLocation[0]);
        setMaxLocation(horseParamsLocation[1]);
        setMaxMove(horseParamsLocation[2]);
        setMaxEat(horseParamsLocation[3]);
    }
}
