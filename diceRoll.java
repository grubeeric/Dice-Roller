import java.util.Random;
import java.util.Scanner;


public class diceRoll {
		
	public static void main(String[] args){
		
		Random randomNumber = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		while(keepGoing){
		
		System.out.println("What type of dice would you like to roll?");
		
		int diceType = sc.nextInt();
		
		if(diceType == 6){
			int roll = randomNumber.nextInt(6) + 1;
			System.out.println("you rolled a " + roll);
		}
		else if(diceType == 4){
			int roll = randomNumber.nextInt(4) + 1;
			System.out.println("you rolled a " + roll);
		}
		else if(diceType == 8){
			int roll = randomNumber.nextInt(8) + 1;
			System.out.println("you rolled a " + roll);
		}
		else if(diceType == 12){
			int roll = randomNumber.nextInt(12) + 1;
			System.out.println("you rolled a " + roll);
		}
		else if(diceType == 20){
			int roll = randomNumber.nextInt(20) + 1;
			System.out.println("you rolled a " + roll);
		}
		
	}
	}
	
}
