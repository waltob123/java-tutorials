package number_guesser;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int number = new Random().nextInt(101);
    int convertedNumber = 0;
    boolean running = true;
    int guessCount = 0;

    public void run() {
        displayWelcomeMessage();
        while (running) {
            guessCount++;
            getUserGuessMessage();
            int userGuess = getUserInput();
            if (checkNumber(userGuess)) {
                displayWinMessage();
                displayExitMessage();
                running = false;
            } else {
                continue;
            }
        }
    }

    private int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try {
            convertedNumber = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            // scanner.close();
        }
        return convertedNumber;
    }

    private boolean checkNumber(int userGuess) {
        if (userGuess == number) {
            return true;
        } else if (userGuess > number) {
            displayTooHighMessage();
            return false;
        } else {
            displayTooLowMessage();
            return false;
        }
    }

    private void displayWinMessage() {
        System.out.println("You guessed the number after " + guessCount +" times!");
    }

    private void displayTooHighMessage() {
        System.out.println("Your guess is too high");
    }

    private void displayTooLowMessage() {
        System.out.println("Your guess is too low");
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome to the number guesser game!");
        System.out.println("========================================");
    }

    private void displayExitMessage() {
        System.out.println("Thanks for playing!");
    }

    private void getUserGuessMessage() {
        System.out.println("Please enter a number between 0 and 100: ");
    }
}
