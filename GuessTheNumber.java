import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I've picked a number between 1 and 100. Can you guess it?");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try guessing higher.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try guessing lower.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
}
