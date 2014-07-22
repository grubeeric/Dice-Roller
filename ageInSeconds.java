import java.util.Scanner;


public class ageInSeconds {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What year were you born in (19XX)?");
		
		int year = sc.nextInt();
		
		System.out.println("What month were you born in(XX)?");
		
		int month = sc.nextInt();
		
		System.out.println("What day were you born (XX)?");
		
		int day = sc.nextInt();
		
		int ageDays = ((2014 - year) * 365) + ((month * 30) - (30-day));
		
		int ageSeconds = ageDays * 86400;
		
		System.out.println("You are " + ageDays + " days old, and " + ageSeconds + " seconds old");
	}
	
}
