
public abstract class Vehicyle {
	private String type;
	protected Manufacturer manufacturer;
	
	public Vehicyle(String type, Manufacturer manufacturer) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getManufacturer() {
		return this.manufacturer.getName();
	}
	
	public void start() {
		System.out.println("Start ....");
	}
	
	public void speeUp() {
		System.out.println("Spee up ....");
	}
	
	public void stop() {
		System.out.println("Stop ....");
	}
	
	public abstract double speed();
	
}
