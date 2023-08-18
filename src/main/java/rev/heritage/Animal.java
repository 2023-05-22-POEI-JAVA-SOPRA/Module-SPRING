package rev.heritage;

public class Animal {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String sound() {
        return "cri de l'animal";
    }
}
