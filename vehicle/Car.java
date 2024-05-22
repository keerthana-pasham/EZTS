package vehicle;

public class Car extends Vehicle {
	
	private String type;
	
	public Car(int a, int b, String c, String t) {
		super(a, b, c);
		this.type=t;
	}
	
	void CarOutput () {
		super.VehicleOutput ();
		System.out.println("Car Type = "+this.type);
		}

}