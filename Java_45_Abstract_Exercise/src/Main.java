
public class Main {
	public static void main(String[] args) {
		Manufacturer manufacturer1 = new Manufacturer("Martin", "VietNam");
		Manufacturer manufacturer2 = new Manufacturer("Mercedes", "USA");
		Manufacturer manufacturer3 = new Manufacturer("Toyota", "Japan");
		
		Flight flight = new Flight("Airbus 500", manufacturer2, "Flight Gas");
		Car car = new Car("Toyota 2022", manufacturer3, "Diesel");
		Bike bike = new Bike("Martin 500", manufacturer1);
		
		//manufacturer name
		System.out.println("Manufacturer 1: " + manufacturer1.getName());
		System.out.println("Manufacturer 2: " + manufacturer2.getName());
		System.out.println("Manufacturer 3: " + manufacturer3.getName());
		
		System.out.println("-------------------------");
		
		//manufacturer nationality
		System.out.println("Manufacturer nationality 1: " + manufacturer1.getCountry());
		System.out.println("Manufacturer nationality 2: " + manufacturer2.getCountry());
		System.out.println("Manufacturer nationality 3: " + manufacturer3.getCountry());
		
		System.out.println("-------------------------");
		
		car.start();
		flight.start();
		bike.start();
		
		System.out.println("-------------------------");
		
		System.out.println("Flight speed: " + flight.speed());
		System.out.println("Car speed: " + car.speed());
		System.out.println("Bike speed: " + bike.speed());
		
	}
}
