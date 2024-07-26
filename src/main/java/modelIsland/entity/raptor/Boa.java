package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.boaParamsLocation;
import static modelIsland.repository.AnimalParameters.boaProbability;

public class Boa extends Raptor {
    public Boa() {
        super(boaParamsLocation[0],
                boaParamsLocation[1],
                boaParamsLocation[2],
                boaParamsLocation[3],
                boaProbability);
    }
}
