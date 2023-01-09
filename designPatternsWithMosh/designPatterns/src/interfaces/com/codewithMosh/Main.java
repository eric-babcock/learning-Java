package interfaces.com.codewithMosh;

public class Main {
	
	public static void main(String[] args) {
		TaxCalculator calculator = getCalculator();
		calculator.calculateTax();

	}
	
	public static TaxXalculator getCalculator() {
		return new TaxCalculator2019();
	}
}
/* Notes */
/*       */
 