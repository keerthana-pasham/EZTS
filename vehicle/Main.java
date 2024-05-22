package vehicle;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		//Vehicle vh = new Vehicle();
		
		System.out.println("Enter the Vehicle Model");
		int m = sc.nextInt();
		
		System.out.println("Enter the Vehicle engine");
		int e = sc.nextInt();
		
		System.out.println("Enter the Vehicle Colour");
		String s = sc.next();
		
		System.out.println("Enter the Vehicle type");
		String t = sc.next();
		
		Bike b = new Bike(m,  e,  s, t);
		
		b.BikeOutput();
		
	}
}