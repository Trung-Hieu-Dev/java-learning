
public class Bike extends Vehicyle {

	public Bike(String type, Manufacturer manufacturer) {
		super("Bike", manufacturer);
	}

	@Override
	public double speed() {
		return 5;
	}
	
}
