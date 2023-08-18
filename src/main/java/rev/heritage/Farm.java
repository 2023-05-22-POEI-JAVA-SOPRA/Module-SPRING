package rev.heritage;

import java.util.Collection;

public class Farm {
	private Collection<Animal> animals;

	public Collection<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Collection<Animal> animals) {
		this.animals = animals;
	}

	public Farm(Collection<Animal> animals) {
		this.animals = animals;
	}
	
	public void toutLeMondeCrie() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " fait " + animal.sound());
        }
	}
	
	public void addAnimal(Animal animal) {
        animals.add(animal);
    }
	
	public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
}
