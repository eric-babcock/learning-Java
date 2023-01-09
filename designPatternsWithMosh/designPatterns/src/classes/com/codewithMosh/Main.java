package classes.com.codewithMosh;

public class Main {
	
	public static void main(String[] args) {
		
		/*User user = new User();// code without constructor
		user.name = "Eric";
		*/
		
		User user = new User("Eric");
		
		System.out.println(user.name);// before creating method
		
		user.sayHello();
	}

}
/* Notes */

/* 
 */