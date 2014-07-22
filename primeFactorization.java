import java.util.Scanner;

public class primeFactorization {
	
	//prime factor program
	public static void main(String[] args) {
		
		//make the scanner for input
		Scanner sc = new Scanner(System.in);
		
		//ask the user what number they would like to get the factors for
		System.out.println("What number would you like the prime factorization for?");
		
		//get the number
		int num = sc.nextInt();
		
		//make a for loop that increments until it reaches the number the user wants
		//the factors for (there can be no factors that are bigger than the number)
		for(int i = 1; i < num; i++){
			//if the number is divisible then print it. It is a factor
			if(num % i == 0){
				System.out.println(i + " is a prime factor of " + num);
			}
			else{
				//if not, do nothing
			}
		}

	}

}
