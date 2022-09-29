package task3;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    private static int rnd_number;

    public static void main(String[] args) {
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        try {
            guess = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a number.");
            makeAGuess();
        }

        if (guess == rnd_number) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("Try again, your guess was " + (guess > rnd_number ? "too high." : "too low."));
            makeAGuess();
        }
    }
}