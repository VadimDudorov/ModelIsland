package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.*;

public class Eagle extends Raptor {
    public Eagle() {
        super(eagleParamsLocation[0],
                eagleParamsLocation[1],
                eagleParamsLocation[2],
                eagleParamsLocation[3],
                eagleProbability);
    }
}
