package modelIsland.entity;

import modelIsland.entity.herbivores.*;
import modelIsland.entity.raptor.*;

import java.util.ArrayList;
import java.util.List;

import static modelIsland.repository.AnimalParameters.*;

public class Location {
    private static int idLocation;
    private List<Plant> plants = new ArrayList<>();
    private List<Bear> bears = new ArrayList<>();
    private List<Boa> boas = new ArrayList<>();
    private List<Eagle> eagles = new ArrayList<>();
    private List<Fox> foxes = new ArrayList<>();
    private List<Wolf> wolves = new ArrayList<>();
    private List<Bull> bulls = new ArrayList<>();
    private List<Caterpillar> caterpillars = new ArrayList<>();
    private List<Deer> deers = new ArrayList<>();
    private List<Duck> ducks = new ArrayList<>();
    private List<Goat> goats = new ArrayList<>();
    private List<Hog> hogs = new ArrayList<>();
    private List<Horse> horses = new ArrayList<>();
    private List<Mouse> mouses = new ArrayList<>();
    private List<Rabbit> rabbits = new ArrayList<>();
    private List<Sheep> sheeps = new ArrayList<>();

    public Location() {
        idLocation = ++idLocation;
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Plant && plants.size() < plantParams[1]) {
            plants.add((Plant) animal);
        }
        if (animal instanceof Bear && bears.size() < bearParams[1]) {
            bears.add((Bear) animal);
        }
        if (animal instanceof Boa && boas.size() < boaParams[1]) {
            boas.add((Boa) animal);
        }
        if (animal instanceof Eagle && eagles.size() < eagleParams[1]) {
            eagles.add((Eagle) animal);
        }
        if (animal instanceof Fox && foxes.size() < foxParams[1]) {
            foxes.add((Fox) animal);
        }
        if (animal instanceof Wolf && wolves.size() < wolfParams[1]) {
            wolves.add((Wolf) animal);
        }
        if (animal instanceof Bull && bulls.size() < bullParams[1]) {
            bulls.add((Bull) animal);
        }
        if (animal instanceof Caterpillar && caterpillars.size() < caterpillarParams[1]) {
            caterpillars.add((Caterpillar) animal);
        }
        if (animal instanceof Deer && deers.size() < deerParams[1]) {
            deers.add((Deer) animal);
        }
        if (animal instanceof Duck && ducks.size() < duckParams[1]) {
            ducks.add((Duck) animal);
        }
        if (animal instanceof Goat && goats.size() < goatParams[1]) {
            goats.add((Goat) animal);
        }
        if (animal instanceof Hog && hogs.size() < hogParams[1]) {
            hogs.add((Hog) animal);
        }
        if (animal instanceof Horse && horses.size() < horseParams[1]) {
            horses.add((Horse) animal);
        }
        if (animal instanceof Mouse && mouses.size() < mouseParams[1]) {
            mouses.add((Mouse) animal);
        }
        if (animal instanceof Rabbit && rabbits.size() < rabbitParams[1]) {
            rabbits.add((Rabbit) animal);
        }
        if (animal instanceof Sheep && sheeps.size() < sheepParams[1]) {
            sheeps.add((Sheep) animal);
        }
    }

    public void removeAnimal(Animal animal){
        if (animal instanceof Plant && !plants.isEmpty()) {
            plants.add((Plant) animal);
        }
        if (animal instanceof Bear && !bears.isEmpty()) {
            bears.add((Bear) animal);
        }
        if (animal instanceof Boa && !boas.isEmpty()) {
            boas.add((Boa) animal);
        }
        if (animal instanceof Eagle && !eagles.isEmpty()) {
            eagles.add((Eagle) animal);
        }
        if (animal instanceof Fox && !foxes.isEmpty()) {
            foxes.add((Fox) animal);
        }
        if (animal instanceof Wolf && !wolves.isEmpty()) {
            wolves.add((Wolf) animal);
        }
        if (animal instanceof Bull && !bulls.isEmpty()) {
            bulls.add((Bull) animal);
        }
        if (animal instanceof Caterpillar && !caterpillars.isEmpty()) {
            caterpillars.add((Caterpillar) animal);
        }
        if (animal instanceof Deer && !deers.isEmpty()) {
            deers.add((Deer) animal);
        }
        if (animal instanceof Duck && !ducks.isEmpty()) {
            ducks.add((Duck) animal);
        }
        if (animal instanceof Goat && !goats.isEmpty()) {
            goats.add((Goat) animal);
        }
        if (animal instanceof Hog && !hogs.isEmpty()) {
            hogs.add((Hog) animal);
        }
        if (animal instanceof Horse && !horses.isEmpty()) {
            horses.add((Horse) animal);
        }
        if (animal instanceof Mouse && !mouses.isEmpty()) {
            mouses.add((Mouse) animal);
        }
        if (animal instanceof Rabbit && !rabbits.isEmpty()) {
            rabbits.add((Rabbit) animal);
        }
        if (animal instanceof Sheep && !sheeps.isEmpty()) {
            sheeps.add((Sheep) animal);
        }
    }
    
}
