package superKeyword;

public class Hero extends Person{
	
	String power;
	
	Hero(String name, int age, String power){
		
		/* these belong to our parent class
		this.name = name;
		this.age = age;
		*/
		super(name,age);
		this.power = power;
		
	}

	public String toString() {
		return super.toString()+this.power;
	}
	
}
