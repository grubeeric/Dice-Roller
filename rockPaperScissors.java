import java.util.Scanner;
import java.util.Random;


public class rockPaperScissors {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rock Paper Scissors!");
		
		String game = "Yes";
		
		int wins = 0;
		int loses = 0;
		int ties = 0;
		
		while(game.equals("Yes")){
		
		System.out.println("Choose your weapon!");
			
		String choice = sc.next();
		
		Random randomGenerator = new Random();
		
		int comp = randomGenerator.nextInt(3);
		
		if(choice.equals("rock")){
			if(comp == 0){
				System.out.println("Computer plays rock. You tie.");
				ties++;
			}
			else if(comp == 1){
				System.out.println("Computer plays scissors. You win.");
				wins++;
			}
			else{
				System.out.println("Computer plays paper. You lose.");
				loses++;
			}
		}
		else if(choice.equals("scissors")){
			if(comp == 0){
				System.out.println("Computer plays rock. You lose.");
				loses++;
			}
			else if(comp == 1){
				System.out.println("Computer plays scissors. You tie.");
				ties++;
			}
			else{
				System.out.println("Computer plays paper. You win.");
				wins++;
			}
		}
		else if(choice.equals("paper")){
			if(comp == 0){
				System.out.println("Computer plays rock. You win.");
				wins++;
			}
			else if(comp == 1){
				System.out.println("Computer plays scissors. You lose.");
				loses++;
			}
			else
			{
				System.out.println("Computer plays paper. You tie.");
				ties++;
			}
		}
		
		System.out.println("Your record is " + wins + " wins, " + loses + " loses, and " + ties + " ties.");
		
		System.out.println("Would you like to play again? (Yes/No)");
		
		game = sc.next();
		
		}
		
		System.out.println("Your final record is " + wins + " wins, " + loses + " loses, and " + ties + " ties.");

		
	}
	
}
