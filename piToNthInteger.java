import java.util.Scanner;

public class piToNthInteger {

	public static void main(String[] args){
		//this program finds PI to the nth decimal
		//if the input was 4, the output would be 3.1416
		//if it was 1, the ouput would be 3.1
		
		//setup the scanner for input
		Scanner sc = new Scanner(System.in);
		
		//ask user how many decimal places to see pi to
		System.out.println("How many dedcimal places would you like to see pi to?");
		
		//get the user input
		int num = sc.nextInt();
		
		//print it out
		System.out.printf("%." + num + "f", Math.PI, num);
		
	}
}
