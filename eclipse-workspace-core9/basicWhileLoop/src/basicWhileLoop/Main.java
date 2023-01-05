package basicWhileLoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// While loop = executes a block of code as long as it's condition(s) remain(s) true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " +name);
		
		
		/*Do Loop
		
		do{
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello " +name);
		*/
		scanner.close();
	}

}
