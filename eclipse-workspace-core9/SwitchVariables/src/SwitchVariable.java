
public class SwitchVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "water";
		String y = "Kool-Aid";
		
		//x = y; // WRONG
		//y = x; // ALSO WRONG
		String temp;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}

}
