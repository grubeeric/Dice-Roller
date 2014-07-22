import java.util.Scanner;

//2013 local programming contest question
//make a program that shows the area of the minimum square
//into which 8 circles of that radius can be packed
public class circle {

	public static void main(String[] args) {
		
		//make scanner for user input
		Scanner sc = new Scanner(System.in);
		
		//prompt user for circles
		System.out.println("Welcome to the circle program. Enter the number of circles you would like to test:");
		
		//get number of areas to be made
		int numInputs = sc.nextInt();
		
		//prompt user for circle radius'
		System.out.println("Now enter your circle radius':");
		
		//for loop that keeps going till the number of inputs is reached
		for(int i = 0; i < numInputs; i++){
			
			//get the radius
			double r = sc.nextDouble();
			
			double circleArea, squareArea, squareLength;
			
			//calculate the circle area
			circleArea = Math.PI * (r * r);
			//calculate the length of one side of the square in relation to the radius of the given circle
			squareLength = r * (2 + (2 / (.5 * (Math.sqrt(6) - Math.sqrt(2)))));
			//get the area of the square from the length of the square
			squareArea = squareLength * squareLength;
			
			//print it out for the user
			System.out.printf("%.05f\n", squareArea);
		}

	}

}
