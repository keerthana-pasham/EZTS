package vehicle;

public class Bus extends Vehicle {
	
	private String type;
	
	public Bus(int a, int b, String c, String t) {
		super(a, b, c);
		this.type=t;
	}
	
	void BusOutput () {
		super.VehicleOutput ();
		System.out.println("Bus Type = "+this.type);
		}

}