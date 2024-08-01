package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.goatParamsLocation;
import static modelIsland.repository.AnimalParameters.goatProbability;

public class Goat extends Herbivores {
    public Goat() {
        super(goatParamsLocation[0],
                goatParamsLocation[1],
                goatParamsLocation[2],
                goatParamsLocation[3],
                goatProbability);
    }
}
