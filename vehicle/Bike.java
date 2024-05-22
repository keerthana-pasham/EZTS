package vehicle;

public class Bike extends Vehicle {
	
	private String type;
	
	public Bike(int a, int b, String c, String t) {
		super(a, b, c);
		this.type=t;
	}
	
	void BikeOutput () {
		super.VehicleOutput ();
		System.out.println("Bike Type = "+this.type);
		}

}
