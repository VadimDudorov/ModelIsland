package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.caterpillarParamsLocation;
import static modelIsland.repository.AnimalParameters.caterpillarProbability;

public class Caterpillar extends Herbivores {
    public Caterpillar() {
        super(caterpillarParamsLocation[0],
                caterpillarParamsLocation[1],
                caterpillarParamsLocation[2],
                caterpillarParamsLocation[3],
                caterpillarProbability);
    }
}
