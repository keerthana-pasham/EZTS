package hospital;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	public static void main(String args[])
	{
		Doctor d=new Doctor("jake",32,'M',"Cardiology");
		System.out.println(d.toString());
		Patient p=new Patient("josh",43,'M',"Anemia",12);
		System.out.println(p.toString());
		Nurse n=new Nurse("keer",21,'F',113);
		n.getNurse();
		n.setNurse(104);
		n.getNurse();
	}
	

}
