package staticKeywordModifier;

public class Friend {
	
	String name;
	static int totalNumberOfFriends;
	int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
		totalNumberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+totalNumberOfFriends+" friends");
	}

}
