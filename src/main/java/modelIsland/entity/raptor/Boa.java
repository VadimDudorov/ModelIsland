package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.boaParamsLocation;

public class Boa extends Raptor {
    public Boa(){
        setWeight(boaParamsLocation[0]);
        setMaxLocation(boaParamsLocation[1]);
        setMaxMove(boaParamsLocation[2]);
        setMaxEat(boaParamsLocation[3]);
    }
}
