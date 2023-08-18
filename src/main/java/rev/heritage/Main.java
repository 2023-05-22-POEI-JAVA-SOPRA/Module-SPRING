package rev.heritage;

public class Main {
	 public static void main(String[] args) {
	        Farm farm = new Farm();
	        farm.addAnimal(new Cow("Margherite"));
	        farm.addAnimal(new Chicken("Cocotte"));
	        farm.addAnimal(new Sheep("Bouboule"));

	        farm.toutLeMondeCrie();
}