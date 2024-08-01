package modelIsland.entity.herbivores;

import modelIsland.entity.Herbivores;

import static modelIsland.repository.AnimalParameters.deerParamsLocation;
import static modelIsland.repository.AnimalParameters.deerProbability;

public class Deer extends Herbivores {
    public Deer() {
        super(deerParamsLocation[0],
                deerParamsLocation[1],
                deerParamsLocation[2],
                deerParamsLocation[3],
                deerProbability);
    }
}
