package hospital;

public class Nurse extends Person{
	private int roomnumber;

	public Nurse(String name, int age, char gender,int roomnum) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
		roomnumber=roomnum;
	}

	@Override
	public String toString() {
		return "Nurse [roomnumber=" + roomnumber + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public void getNurse() {
		System.out.println(toString());
	}
	public void setNurse(int roomnum) {
		roomnumber=roomnum;
	}
	

}
