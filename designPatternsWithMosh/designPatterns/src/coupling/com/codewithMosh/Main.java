package coupling.com.codewithMosh;

public class Main {
	
	public static void main(String[] args) {
		User user = new User("Eric",32);

		user.sayHello();
	}

}
/* Notes */
/* These are coupled because a change to the user class breaks the main class
 */