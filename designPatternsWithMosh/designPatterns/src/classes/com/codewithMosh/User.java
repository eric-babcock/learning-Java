package classes.com.codewithMosh;

public class User {
	// Fields (attributes)
	public String name;
	
	public User(String name) {//This is a constructor
		this.name = name;
	}
	// Methods
	
	public void sayHello() {
		System.out.println("Hi, my name is "+ name);
	}
}

/*Notes*/

/* for now we declare everything 
 * public, even though this is a 
 * bad practice in general
 * 
 * Constructer: a function that is 
 * called when a new instance of a 
 * class is created*/
 