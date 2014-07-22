import java.util.Scanner;


public class caesarCipher {
	
	//This program allows the user to enter a string, and it gives them their string back
	//with a caesar cipher that shifts for the number of characters desired
	public static void main(String[] args){
		//setup the scanner for input
		Scanner sc = new Scanner(System.in);
		
		//this character array is an alphabet that the program uses to shift the message to be encrypted
		//It has upper and lower case because the message is always given back to the user in upper case,
		//and including the lower case alphabet makes it easier to shift the letters and then just turn them
		//back to upper case letters for the case of 'Z' being shifted 3 spaces to c -> C
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
		
		System.out.println("Welcome to the Caesar Cipher Encryption Software!");
		System.out.println("Print your message to recieve the encrypted text: ");
		
		//get the message to be encrypted
		String initial = sc.nextLine();
		
		System.out.println("Thank you. How many spaces would you like the letter to be shifted?");
		
		//get number of spaces to be shifted
		int shifts = sc.nextInt();
		
		//put the message to upper case for ease of shifting
		String message = initial.toUpperCase();
		
		//turn the message into a char array for easy traversal and editing
		char[] messageArray = message.toCharArray();
		
		//for loop that goes through each index of the messageArray
		for(int i = 0; i < message.length(); i++){
			//get the char at the current index
			char c = messageArray[i];
			
			//this for loop goes over every letter case
			for(int j = 0; j < 52; j++){
				//if the char at the current index equals the alphabet array index
				if(c == alphabet[j]){
					//then shift the char to its encryption location
					c = alphabet[j + shifts];
					//and change the message array to that char
					messageArray[i] = c;
					//and break out of the inner for loop
					break;
				}
			}
			
		}
		
		//this temp string holds the message Array
		String temp = new String(messageArray);
		
		//so that it can turned back into upper case
		String encryption = temp.toUpperCase();
		
		//and then the encrypted message is given back to the user
		System.out.println("Your Caesar Cipher is " + encryption);

	}
	
}
