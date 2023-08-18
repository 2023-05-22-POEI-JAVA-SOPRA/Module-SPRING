package rev.heritage;

public class Chicken extends Animal {
	
	public Chicken(String name) {
		super(name);
	}

	@Override
    public String sound() {
        return "cot cot";
    }
}
