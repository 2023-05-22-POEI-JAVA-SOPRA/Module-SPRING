package rev.heritage;

public class Sheep extends Animal {
	
	public Sheep(String name) {
		super(name);
	}

	@Override
    public String sound() {
        return "beh";
    }

}
