package rev.heritage;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	private List<Animal> animals;

	public List<Animal> getAnimals() {
		return animals;
	}

	 public Farm() {
	        animals = new ArrayList<>();
	    }
	 
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Farm(List<Animal> animals) {
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
