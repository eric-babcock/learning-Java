package overloadedConstructors;

public class Main {

	public static void main(String[] args) {
		
		/* overloaded constructors =  multiple constructors withing a class with the same name,
		                              but hagve different parameters
		                              name + parameters = signature
		*/
		
		Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella","pepperoni");
		
		System.out.println("Here are the ingredients fo your pizza:");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		
		Pizza cheesePizza = new Pizza("thick crust", "tomato", "mozzerella");
		
		System.out.println("Here are the ingredients fo your pizza:");
		System.out.println(cheesePizza.bread);
		System.out.println(cheesePizza.sauce);
		System.out.println(cheesePizza.cheese);
		System.out.println(cheesePizza.topping);
		
		
		Pizza flatBreadPizza = new Pizza("thick crust", "tomato");
		
		System.out.println("Here are the ingredients fo your pizza:");
		System.out.println(flatBreadPizza.bread);
		System.out.println(flatBreadPizza.sauce);
		System.out.println(flatBreadPizza.cheese);
		System.out.println(flatBreadPizza.topping);
		
	}
		
}
