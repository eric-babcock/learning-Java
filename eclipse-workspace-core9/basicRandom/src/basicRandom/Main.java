package basicRandom;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		//int x = random.nextInt();
		//int x = random.nextInt(6)+1;
		boolean y = random.nextBoolean();
		//double y = random.nextDouble();
		System.out.println(y);
	}

}
