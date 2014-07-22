import java.util.Random;


public class passwordGenerator {
	
	public static void main(String[] args){
		
		Random randomNumber = new Random();
		
		int numOrLetter = randomNumber.nextInt(2);
		int letter = randomNumber.nextInt(52);
		int number = randomNumber.nextInt(10);
		int length = 10;
		
		char[] password = "".toCharArray();
		
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvexyz".toCharArray();
		
		for(int i = 0; i < length; i++){
			if(numOrLetter == 0){
				char c = (char) number; 
				password[i] = c;
			}
			else if(numOrLetter == 1){
				password[i] = alphabet[letter];
			}
			i++;
		}
		
		String realPassword = password.toString();
		
		System.out.println("Your password is: " + realPassword);
		
	}

}
