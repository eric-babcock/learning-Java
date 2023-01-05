package copyObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Chevrolet","Camaro",2021);
		
		// *copy method example
		//Car car2 = new Car("Ford","Mustang",2022);
	
		// car2 = car1;   This is bad!
		
		// *
		//car2.copy(car1);
		
		//instantiation example - overloaded constructor
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}
	
	

}
