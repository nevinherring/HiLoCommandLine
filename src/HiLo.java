import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
        
		// get ready for the player to user the keyboard
		Scanner scan = new Scanner(System.in);
		
		// create a random number from 1-100
		int theNumber = (int)(Math.random()*100 + 1);
		
		int guess = 0;
		
		while ( guess != theNumber ) {
			System.out.println("Guess a number between 1 and 100:");
			
			// get the user's guess
			guess = scan.nextInt();
			
			if (guess < theNumber) {
				System.out.println(guess + " is too low.  Try again.");
			}else if(guess > theNumber) {
				System.out.println(guess + " is too high.  Try again.");
			}else {
				System.out.println(guess + " is correct!");
			}
			
		}

	}

}
