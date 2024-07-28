package modelIsland.entity;

import modelIsland.entity.herbivores.*;
import modelIsland.entity.raptor.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.*;

public class Location {
    private final int idLocation;
    private final List<Wolf> wolfs = new ArrayList<>();
    private final List<Boa> boas = new ArrayList<>();
    private final List<Fox> foxes = new ArrayList<>();
    private final List<Bear> bears = new ArrayList<>();
    private final List<Eagle> eagles = new ArrayList<>();
    private final List<Horse> horses = new ArrayList<>();
    private final List<Deer> dears = new ArrayList<>();
    private final List<Rabbit> rabbits = new ArrayList<>();
    private final List<Mouse> mouses = new ArrayList<>();
    private final List<Goat> goats = new ArrayList<>();
    private final List<Sheep> sheeps = new ArrayList<>();
    private final List<Hog> hogs = new ArrayList<>();
    private final List<Bull> bulls = new ArrayList<>();
    private final List<Duck> ducks = new ArrayList<>();
    private final List<Caterpillar> caterpillars = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();

    private Map<String, List<? extends Animal>> mapsAnimal = new HashMap<>() {{
        mapsAnimal.put(nameAnimals[0], wolfs);
        mapsAnimal.put(nameAnimals[1], boas);
        mapsAnimal.put(nameAnimals[2], foxes);
        mapsAnimal.put(nameAnimals[3], bears);
        mapsAnimal.put(nameAnimals[4], eagles);
        mapsAnimal.put(nameAnimals[5], horses);
        mapsAnimal.put(nameAnimals[6], dears);
        mapsAnimal.put(nameAnimals[7], rabbits);
        mapsAnimal.put(nameAnimals[8], goats);
        mapsAnimal.put(nameAnimals[9], sheeps);
        mapsAnimal.put(nameAnimals[10], hogs);
        mapsAnimal.put(nameAnimals[11], bulls);
        mapsAnimal.put(nameAnimals[12], ducks);
        mapsAnimal.put(nameAnimals[13], caterpillars);
        mapsAnimal.put(nameAnimals[14], plants);
    }};

    public Location(int idLocation) {
        this.idLocation = idLocation;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public boolean addAnimal(Animal animal) {

        if (animal instanceof Plant && plants.size() < plantParamsLocation[1]) {
            plants.add((Plant) animal);
            return true;
        }
        if (animal instanceof Bear && bears.size() < bearParamsLocation[1]) {
            bears.add((Bear) animal);
            return true;
        }
        if (animal instanceof Boa && boas.size() < boaParamsLocation[1]) {
            boas.add((Boa) animal);
            return true;
        }
        if (animal instanceof Eagle && eagles.size() < eagleParamsLocation[1]) {
            eagles.add((Eagle) animal);
            return true;
        }
        if (animal instanceof Fox && foxes.size() < foxParamsLocation[1]) {
            foxes.add((Fox) animal);
            return true;
        }
        if (animal instanceof Wolf && wolfs.size() < wolfParamsLocation[1]) {
            wolfs.add((Wolf) animal);
            return true;
        }
        if (animal instanceof Bull && bulls.size() < bullParamsLocation[1]) {
            bulls.add((Bull) animal);
            return true;
        }
        if (animal instanceof Caterpillar && caterpillars.size() < caterpillarParamsLocation[1]) {
            caterpillars.add((Caterpillar) animal);
            return true;
        }
        if (animal instanceof Deer && dears.size() < deerParamsLocation[1]) {
            dears.add((Deer) animal);
            return true;
        }
        if (animal instanceof Duck && ducks.size() < duckParamsLocation[1]) {
            ducks.add((Duck) animal);
            return true;
        }
        if (animal instanceof Goat && goats.size() < goatParamsLocation[1]) {
            goats.add((Goat) animal);
            return true;
        }
        if (animal instanceof Hog && hogs.size() < hogParamsLocation[1]) {
            hogs.add((Hog) animal);
            return true;
        }
        if (animal instanceof Horse && horses.size() < horseParamsLocation[1]) {
            horses.add((Horse) animal);
            return true;
        }
        if (animal instanceof Mouse && mouses.size() < mouseParamsLocation[1]) {
            mouses.add((Mouse) animal);
            return true;
        }
        if (animal instanceof Rabbit && rabbits.size() < rabbitParamsLocation[1]) {
            rabbits.add((Rabbit) animal);
            return true;
        }
        if (animal instanceof Sheep && sheeps.size() < sheepParamsLocation[1]) {
            sheeps.add((Sheep) animal);
            return true;
        }
        return false;
    }

    public boolean removeAnimal(String nameAnimal, Animal animal){
        List<? extends Animal> animals = mapsAnimal.get(nameAnimal);
        return animals.remove(animal);
    }

    public List<? extends Animal> countAnimals(String nameAnimal) {
        return mapsAnimal.get(nameAnimal);
    }
}
