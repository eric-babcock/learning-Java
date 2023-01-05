package basicPrintf;

public class Main {

	public static void main(String[] args) {
		/* printf() =  an optional method to control, format, and display text to the console window
		 *   		   two arguments = format string + (object /variable/value)
		 *   		   % [flags] [precision] [width] [conversion-character]
		 */

		//System.out.printf("This is a format string %d", 123);
		
		boolean myBoolean = true;
		char myChar = 'E';
		String myString = "Eric";
		int myInt = -50;
		double myDouble = 1000000000;
		
		System.out.printf("%b",myBoolean);
		System.out.printf("\n%c",myChar);
		System.out.printf("\n%s",myString);
		System.out.printf("\n%d",myInt);
		System.out.printf("\n%f\n",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("\nYou have this much money %25.2f ",myDouble);
		
		//[flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma gouping separator if numbers > 1000
		
		System.out.printf("\nYou have this much money %20.2f ",myDouble);
		System.out.printf("\nYou have this much money %+d ",myInt);
		System.out.printf("\nYou have this much money %0+,25f ",myDouble);
		
		
	
	
	
	
	
	
	
	}

}
