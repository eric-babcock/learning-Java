import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		//System.out.println(bakeryList);
		//System.out.println(bakeryList.get(0));
	
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("zuccini");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		//System.out.println(drinksList);
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1));
		
		
	}

}
