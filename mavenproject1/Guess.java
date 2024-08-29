import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 10
        int targetNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have picked a number between 1 and 10. Try to guess it!");

        while (userGuess != targetNumber) {
            System.out.print("Enter your guess (1-10): ");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        scanner.close();
    }
}
