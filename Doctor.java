package hospital;

public class Doctor extends Person {
	private String speciality;
	public Doctor(String name,int age ,char gender,String spec) {
		super(name,age,gender);
		speciality=spec;
	}
	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
