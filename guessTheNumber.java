package practice;
import java.util.Random;
import java.util.Scanner;
public class guessTheNumber {


	 public static void main(String[] args) {
	       
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);

	        
	        int randomNumber = random.nextInt(100) + 1;
	        int guess = 0;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have picked a number between 1 and 100. Try to guess it! in 10 attempts");

	       
	        while (guess != randomNumber && attempts<=10) {
	            System.out.print("Enter your guess: ");
	            try {
	                guess = scanner.nextInt();
	                attempts++;

	                
	                if (guess < randomNumber) {
	                    System.out.println("Too low! Try again.");
	                } else if (guess > randomNumber) {
	                    System.out.println("Too high! Try again.");
	                } else {
	                    System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts!");
	                }
	            } catch (java.util.InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a whole number.");
	                scanner.next(); 
	            }
	            
	        }

	        
	        scanner.close();

	}

}




   
