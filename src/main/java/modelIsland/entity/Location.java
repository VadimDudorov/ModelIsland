package modelIsland.entity;

import modelIsland.entity.herbivores.*;
import modelIsland.entity.raptor.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static modelIsland.repository.AnimalParameters.*;

public class Location {
    private int idLocation;
    private List<Wolf> wolfs = new ArrayList<>();
    private List<Boa> boas = new ArrayList<>();
    private List<Fox> foxes = new ArrayList<>();
    private List<Bear> bears = new ArrayList<>();
    private List<Eagle> eagles = new ArrayList<>();
    private List<Horse> horses = new ArrayList<>();
    private List<Deer> dears = new ArrayList<>();
    private List<Rabbit> rabbits = new ArrayList<>();
    private List<Mouse> mouses = new ArrayList<>();
    private List<Goat> goats = new ArrayList<>();
    private List<Sheep> sheeps = new ArrayList<>();
    private List<Hog> hogs = new ArrayList<>();
    private List<Bull> bulls = new ArrayList<>();
    private List<Duck> ducks = new ArrayList<>();
    private List<Caterpillar> caterpillars = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

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

    public boolean removeAnimal(String nameAnimal) {
        List<? extends Animal> animals = mapsAnimal.get(nameAnimal);
        animals.remove(0);
        return true;


//        if (animal instanceof Plant && !plants.isEmpty()) {
//            plants.add((Plant) animal);
//        }
//        if (animal instanceof Bear && !bears.isEmpty()) {
//            bears.add((Bear) animal);
//        }
//        if (animal instanceof Boa && !boas.isEmpty()) {
//            boas.add((Boa) animal);
//        }
//        if (animal instanceof Eagle && !eagles.isEmpty()) {
//            eagles.add((Eagle) animal);
//        }
//        if (animal instanceof Fox && !foxes.isEmpty()) {
//            foxes.add((Fox) animal);
//        }
//        if (animal instanceof Wolf && !wolfs.isEmpty()) {
//            wolfs.add((Wolf) animal);
//        }
//        if (animal instanceof Bull && !bulls.isEmpty()) {
//            bulls.add((Bull) animal);
//        }
//        if (animal instanceof Caterpillar && !caterpillars.isEmpty()) {
//            caterpillars.add((Caterpillar) animal);
//        }
//        if (animal instanceof Deer && !dears.isEmpty()) {
//            dears.add((Deer) animal);
//        }
//        if (animal instanceof Duck && !ducks.isEmpty()) {
//            ducks.add((Duck) animal);
//        }
//        if (animal instanceof Goat && !goats.isEmpty()) {
//            goats.add((Goat) animal);
//        }
//        if (animal instanceof Hog && !hogs.isEmpty()) {
//            hogs.add((Hog) animal);
//        }
//        if (animal instanceof Horse && !horses.isEmpty()) {
//            horses.add((Horse) animal);
//        }
//        if (animal instanceof Mouse && !mouses.isEmpty()) {
//            mouses.add((Mouse) animal);
//        }
//        if (animal instanceof Rabbit && !rabbits.isEmpty()) {
//            rabbits.add((Rabbit) animal);
//        }
//        if (animal instanceof Sheep && !sheeps.isEmpty()) {
//            sheeps.add((Sheep) animal);
//        }
    }

    public Map<String, Integer> countAnimals() {
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put(nameAnimals[0], wolfs.size());
        countMap.put(nameAnimals[1], boas.size());
        countMap.put(nameAnimals[2], foxes.size());
        countMap.put(nameAnimals[3], bears.size());
        countMap.put(nameAnimals[4], eagles.size());
        countMap.put(nameAnimals[5], horses.size());
        countMap.put(nameAnimals[6], dears.size());
        countMap.put(nameAnimals[7], rabbits.size());
        countMap.put(nameAnimals[8], mouses.size());
        countMap.put(nameAnimals[9], goats.size());
        countMap.put(nameAnimals[10], sheeps.size());
        countMap.put(nameAnimals[11], hogs.size());
        countMap.put(nameAnimals[12], bulls.size());
        countMap.put(nameAnimals[13], ducks.size());
        countMap.put(nameAnimals[14], caterpillars.size());
        return countMap;
    }
    public List<? extends Animal> getMapsAnimal(String name){
        return mapsAnimal.get(name);
    }
}
