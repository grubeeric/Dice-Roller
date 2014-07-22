import java.util.Scanner;


public class reverseString {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		
		String word = sc.next();
		
		String reverse = new StringBuffer(word).reverse().toString();
		
		System.out.println(reverse);
	}
	
}
