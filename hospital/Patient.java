package hospital;

public class Patient extends Person {
	private String disease;private  int bedno;

	public Patient(String name, int age, char gender,String dis,int bno) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
		disease=dis;
		bedno=bno;
	}

	@Override
	public String toString() {
		return "Patient [disease=" + disease + ", bedno=" + bedno + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	

	
}
