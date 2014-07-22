
public class Fibonacci {
	
	//the fibonacci sequence
	public static void main(String[] args){
		//create a variable that holds the answer
		//run the fibonacci function
		int ans = runFib(20);
		//print the answer
		System.out.println(ans);
	}
	
	//function for fibonacci
	//takes in a number that decides how far to 
	//go in the sequence
	public static int runFib(int num){
		//this problem is solved recursively, so if the number is 2 or less
		//it can safely return 1 because it has reached the end of the 
		//sequence
		if(num <= 2){
			return 1;
		}
		//if not, recursively run the program again
		//decrementing it down by 1 and adding it 
		//to the next iteration in the list
		else{
			return runFib(num - 1) + runFib(num - 2);
		}	
	}
	
}
