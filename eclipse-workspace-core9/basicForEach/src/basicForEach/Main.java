package basicForEach;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/* for-each = traversing technique to iterate through the elements in an array/collection
		 *            less steps, more readability
		 *            lessflexible
		 */
		
		// array
		String [] animals = {"cat", "dog","rat","bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}
			
		// collection
		ArrayList<String> animals2 = new ArrayList<String>();
		
		for(String i :animals) {
			animals2.add(i);
		}
		
		System.out.println(animals2);
			
		for(String i : animals2) {
			System.out.println(i);
		}

	}

}
