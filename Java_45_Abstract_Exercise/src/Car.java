
public class Car extends Vehicyle {
	private String fuel;

	public Car(String type, Manufacturer manufacturer, String fuel) {
		super("Car", manufacturer);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public double speed() {
		return 100;
	}

	
}
