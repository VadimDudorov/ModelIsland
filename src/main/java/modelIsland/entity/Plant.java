package modelIsland.entity;

import modelIsland.repository.AnimalParameters;
import modelIsland.service.Location;
import modelIsland.utilityClass.UtillitRandom;

import java.util.List;
import java.util.Objects;

public class Plant implements Animal {
    private int idObject = AnimalParameters.idObject++;
    private int weight;
    private int maxLocation;
    private int gender = UtillitRandom.getRandom(2) + 1;
    private String nameClass = this.getClass().getSimpleName();

    public double getWeight() {
        return weight;
    }

    public int getGender() {
        return gender;
    }

    public int getMaxLocation() {
        return maxLocation;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxLocation(int maxLocation) {
        this.maxLocation = maxLocation;
    }

    @Override
    public void eat(Location id) {
    }

    @Override
    public Location move(Location id) {
        return null;
    }

    @Override
    public void reproduce(Location id) {
        if (gender == 2) {
            return;
        }
        List<? extends Animal> animalsList = id.countAnimals(nameClass);
        if (!animalsList.isEmpty()) {
            List<Plant> listPair = animalsList.stream().map(e -> (Plant) e).filter(e -> e.getGender() == 2).toList();
            if (!listPair.isEmpty()) {
                id.addAnimal(new Plant());
            }
        }
    }

    @Override
    public boolean dead(Location id) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return idObject == plant.idObject;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idObject);
    }
}
