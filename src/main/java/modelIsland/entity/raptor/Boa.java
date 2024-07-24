package modelIsland.entity.raptor;

import modelIsland.entity.Raptor;

import static modelIsland.repository.AnimalParameters.boaParams;

public class Boa extends Raptor {
    public Boa(){
        setWeight(boaParams[0]);
        setMaxLocation(boaParams[1]);
        setMaxMove(boaParams[2]);
        setMaxEat(boaParams[3]);
    }
}
