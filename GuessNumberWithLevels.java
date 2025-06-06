import java.util.Scanner;
import java.util.Random;

public class GuessNumberWithLevels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Guess The Number =====");
            System.out.println("1. Start Game");
            System.out.println("2. How to Play");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    showInstructions();
                    break;
                case 3:
                    System.out.println(" Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("❗ Invalid choice. Try again.\n");
            }
        } while (choice != 3);

        scanner.close();
    }

    static void startGame(Scanner scanner) {
        System.out.println("\n🎯 Choose Difficulty Level:");
        System.out.println("1. Easy (1-50, 10 attempts)");
        System.out.println("2. Medium (1-100, 7 attempts)");
        System.out.println("3. Hard (1-200, 5 attempts)");
        System.out.print("Enter level: ");
        int level = scanner.nextInt();

        int maxNumber = 100;
        int maxAttempts = 7;

        switch (level) {
            case 1:
                maxNumber = 50;
                maxAttempts = 10;
                break;
            case 2:
                maxNumber = 100;
                maxAttempts = 7;
                break;
            case 3:
                maxNumber = 200;
                maxAttempts = 5;
                break;
            default:
                System.out.println("❗ Invalid level. Starting medium level by default.\n");
        }

        int target = new Random().nextInt(maxNumber) + 1;
        int attemptsLeft = maxAttempts;

        System.out.println("\n I have picked a number between 1 and " + maxNumber);
        System.out.println("You have " + maxAttempts + " attempts to guess it!\n");

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == target) {
                System.out.println(" Correct! You guessed it!");
                return;
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attemptsLeft--;
            System.out.println("Attempts left: " + attemptsLeft + "\n");
        }

        System.out.println("❌ Game Over! The correct number was: " + target + "\n");
    }

    static void showInstructions() {
        System.out.println("\n📜 How to Play:");
        System.out.println("- The computer will choose a random number.");
        System.out.println("- You have limited attempts based on the difficulty level.");
        System.out.println("- After each guess, you'll get feedback.");
        System.out.println("- Try to guess the number before your attempts run out.\n");
    }
}
