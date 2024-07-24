package modelIsland.entity;

import modelIsland.entity.herbivores.*;
import modelIsland.entity.raptor.*;

import java.util.List;

import static modelIsland.repository.AnimalParameters.*;

public class Location {
    List<Plant> plants;
    List<Bear> bears;
    List<Boa> boas;
    List<Eagle> eagles;
    List<Fox> foxes;
    List<Wolf> wolves;
    List<Bull> bulls;
    List<Caterpillar> caterpillars;
    List<Deer> deers;
    List<Duck> ducks;
    List<Goat> goats;
    List<Hog> hogs;
    List<Horse> horses;
    List<Mouse> mouses;
    List<Rabbit> rabbits;
    List<Sheep> sheeps;

    public void addAnimal (Animal animal){
       if (animal instanceof Plant && plants.size() < plantParams[1]){
           plants.add((Plant) animal);
       }
        if (animal instanceof Bear && plants.size() < plantParams[1]){
            bears.add((Bear) animal);
        }
        if (animal instanceof Boa && plants.size() < plantParams[1]){
            boas.add((Boa) animal);
        }
        if (animal instanceof Eagle && plants.size() < plantParams[1]){
            eagles.add((Eagle) animal);
        }
        if (animal instanceof Fox && plants.size() < plantParams[1]){
            foxes.add((Fox) animal);
        }
        if (animal instanceof Wolf && plants.size() < plantParams[1]){
            wolves.add((Wolf) animal);
        }
        if (animal instanceof Bull && plants.size() < plantParams[1]){
            bulls.add((Bull) animal);
        }
        if (animal instanceof Caterpillar && plants.size() < plantParams[1]){
            caterpillars.add((Caterpillar) animal);
        }
        if (animal instanceof Deer && plants.size() < plantParams[1]){
            deers.add((Deer) animal);
        }
        if (animal instanceof Duck && plants.size() < plantParams[1]){
            ducks.add((Duck) animal);
        }
        if (animal instanceof Goat && plants.size() < plantParams[1]){
            goats.add((Goat) animal);
        }
        if (animal instanceof Hog && plants.size() < plantParams[1]){
            hogs.add((Hog) animal);
        }
        if (animal instanceof Horse && plants.size() < plantParams[1]){
            horses.add((Horse) animal);
        }
        if (animal instanceof Mouse && plants.size() < plantParams[1]){
            mouses.add((Mouse) animal);
        }
        if (animal instanceof Rabbit && plants.size() < plantParams[1]){
            rabbits.add((Rabbit) animal);
        }
        if (animal instanceof Sheep && plants.size() < plantParams[1]){
            sheeps.add((Sheep) animal);
        }
    }
}
