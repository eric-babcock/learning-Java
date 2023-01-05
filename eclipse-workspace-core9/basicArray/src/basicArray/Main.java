package basicArray;

public class Main {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		String[] newCars = new String[3];
		
		newCars[2] = "Camaro";
		
		System.out.println(newCars);
		
		for (int i = 0; i<newCars.length; i++) {
			System.out.println(newCars[i]);
			
		}
	}

}
