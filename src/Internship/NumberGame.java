package Internship;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int lowerLimit = 1;
        int upperLimit = 100;
        int targetNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

        
        int maxAttempts = 10;
        int attempts = 0;

        while (attempts < maxAttempts) {
            
            System.out.print("Guess the number between " + lowerLimit + " and " + upperLimit + ": ");
            int userGuess = scanner.nextInt();

           
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                        " in " + (attempts + 1) + " attempts.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            attempts++;
        }

        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
        }

        
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scanner.next().toLowerCase();
        
        if (playAgain.equals("yes")) {
            playGame();  // Recursive call to play again
        } else {
            System.out.println("Thanks for playing!");
        }

        scanner.close();
    }
}

