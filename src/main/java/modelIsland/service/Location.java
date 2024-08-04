package modelIsland.service;

import modelIsland.entity.Animal;
import modelIsland.entity.Plant;
import modelIsland.entity.herbivores.*;
import modelIsland.entity.raptor.*;

import java.util.*;

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

    private Map<String, List<? extends Animal>> mapsAnimal = new HashMap<>();

    public Location(int idLocation) {
        this.idLocation = idLocation;
        for (int i = 0; i < nameAnimals.length; i++) {
            int count = (int) arraysParametersLocation.get(nameAnimals[i])[1];
            for (int j = 1; j < count * initializationNumberAnimals; j++) {
                initialize(nameAnimals[i]);
            }
        }
        mapsAnimal.put(nameAnimals[0], wolfs);
        mapsAnimal.put(nameAnimals[1], boas);
        mapsAnimal.put(nameAnimals[2], foxes);
        mapsAnimal.put(nameAnimals[3], bears);
        mapsAnimal.put(nameAnimals[4], eagles);
        mapsAnimal.put(nameAnimals[5], horses);
        mapsAnimal.put(nameAnimals[6], dears);
        mapsAnimal.put(nameAnimals[7], rabbits);
        mapsAnimal.put(nameAnimals[8], mouses);
        mapsAnimal.put(nameAnimals[9], goats);
        mapsAnimal.put(nameAnimals[10], sheeps);
        mapsAnimal.put(nameAnimals[11], hogs);
        mapsAnimal.put(nameAnimals[12], bulls);
        mapsAnimal.put(nameAnimals[13], ducks);
        mapsAnimal.put(nameAnimals[14], caterpillars);
        mapsAnimal.put(nameAnimals[15], plants);
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

    public boolean removeAnimal(String nameAnimal, Animal animal) {
        List<? extends Animal> animals = mapsAnimal.get(nameAnimal);
        return animals.remove(animal);
    }

    public List<? extends Animal> countAnimals(String nameAnimal) {
        return mapsAnimal.get(nameAnimal);
    }

    private void initialize(String name) {
        switch (name) {
            case "Wolf" -> wolfs.add(new Wolf());
            case "Boa" -> boas.add(new Boa());
            case "Fox" -> foxes.add(new Fox());
            case "Bear" -> bears.add(new Bear());
            case "Eagle" -> eagles.add(new Eagle());
            case "Horse" -> horses.add(new Horse());
            case "Deer" -> dears.add(new Deer());
            case "Rabbit" -> rabbits.add(new Rabbit());
            case "Mouse" -> mouses.add(new Mouse());
            case "Goat" -> goats.add(new Goat());
            case "Sheep" -> sheeps.add(new Sheep());
            case "Hog" -> hogs.add(new Hog());
            case "Bull" -> bulls.add(new Bull());
            case "Duck" -> ducks.add(new Duck());
            case "Caterpillar" -> caterpillars.add(new Caterpillar());
            case "Plant" -> plants.add(new Plant());
            default -> throw new RuntimeException("При инициализации не найден подходящий класс");
        }
    }

    public void lifeCycle() {
        for (List<? extends Animal> list : mapsAnimal.values()) {
            List<? extends Animal> listCopy = new ArrayList<>(list);
            for (Animal animal : listCopy) {
                animal.eat(this);
                if (!animal.dead(this)) {
                    animal.reproduce(this);
                    animal.move(this);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                " idLocation=" + idLocation +
                ", plants=" + plants.size() +
                ", caterpillars=" + caterpillars.size() +
                ", ducks=" + ducks.size() +
                ", bulls=" + bulls.size() +
                ", hogs=" + hogs.size() +
                ", sheeps=" + sheeps.size() +
                ", goats=" + goats.size() +
                ", mouses=" + mouses.size() +
                ", rabbits=" + rabbits.size() +
                ", dears=" + dears.size() +
                ", horses=" + horses.size() +
                ", eagles=" + eagles.size() +
                ", bears=" + bears.size() +
                ", foxes=" + foxes.size() +
                ", boas=" + boas.size() +
                ", wolfs=" + wolfs.size() +
         " }";
    }
}
