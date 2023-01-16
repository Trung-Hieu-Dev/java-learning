
public class Flight extends Vehicyle {

	private String fuel;

	public Flight(String type, Manufacturer manufacturer, String fuel) {
		super("Flight", manufacturer);
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
		return 500;
	}
	
	public void takeOff() {
		System.out.println("Take off...");
	}
	
	public void landing() {
		System.out.println("Landing...");
	}

}
