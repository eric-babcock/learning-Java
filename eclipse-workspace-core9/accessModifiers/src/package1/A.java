package package1;
import package2.*;

public class A {

	/*invisible at the moment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		
		System.out.println(C.defaultMessage);
	
	}
	*/
	
	/* visible while C is a public method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		
		System.out.println(c.publicMessage);
	
	}
	*/
	
	// protected String protectedMessage = "This is protected";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		System.out.println(b.privateMessage);
		
	}	
	
}



/* Access Levels
 * 
 * ====================================================
 * | Modifier    | Class | Package | Subclass | World |
 * | public      |   Y   |    Y    |     Y    |   Y   |
 * | protected   |   Y   |    Y    |     Y    |   N   |
 * | no modifier |   Y   |    Y    |     N    |   N   |
 * | private     |   Y   |    N    |     N    |   N   |
 * ====================================================
 * 
 */


