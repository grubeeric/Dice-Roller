import java.util.Scanner;


public class costTile {

	//calculates how much it will cost to buy tile for a room
	public static void main(String[] args) {

		//make the scanner for input
		Scanner sc = new Scanner(System.in);
		
		//get the width
		System.out.println("What is the width of your room?");
		
		float width = sc.nextFloat();
		
		//get the length
		System.out.println("What is the length of your room?");
		
		float length = sc.nextFloat();
		
		//get the cost for the tile
		System.out.println("What is the cost of your tile per square foot?");
		
		float cost = sc.nextFloat();
		
		//find the total cost
		float total = (width * length) * cost;
		
		//print it to the user
		System.out.println("It will cost $" + total + " in order to purchase the tile for your room");

	}

}
