package package2;
import package1.*;

public class Asub extends A{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* This will run because C is in the same package
		C c = new C();
		
		System.out.println(c.defaultMessage);
		*/
		
		/* This works because Asub is a child of A
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);
		*/
		
		
		
	}	
}
