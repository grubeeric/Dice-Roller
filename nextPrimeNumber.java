import java.util.Scanner;


public class nextPrimeNumber {
	
	//same program as primeFactorization, but it asks the user
	//if it wants to continue giving factors after every factor 
	//it gives
	public static void main(String[] args){
		
		//string holding the users answer to keep going or not
		String ans;
		
		//making the scanner for input
		Scanner sc = new Scanner(System.in);
		
		//ask the user what number to get factors for
		System.out.println("What number would you like the prime factors for?");
		
		//get the user input
		int num = sc.nextInt();
		
		//for loop that keeps going up in numbers until it hits the user input
		//(There is no factor that is bigger than its number)
		for(int i = 1; i < num; i ++){
			//if it is a factor
			if(num % i == 0){
				//tell the user
				System.out.println(i + " is a prime factor of " + num);
				//ask if they woyuld like the next factor
				System.out.println("Would you like the next factor for " + num + "? (Y/N)");
				
				//get the answer
				ans = sc.next();
				
				//if the answer is yes, continue
				if(ans.equals("Yes") || ans.equals("Y")){
					
				}
				//if it's anything else, break out of the loop
				else{
					break;
				}
				
			}
			else{
				
			}
		}
	}
	
	
	
}
