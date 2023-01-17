package file;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        String computerInput = "";
        String winner = "";
        boolean updated = false;

        Random random = new Random();


        do {
            // scanning for user's first input
            // the "if" code block below will only run for the first time
            // subsequent scanning of user input will happen at the bottom
            if (!updated) {
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                userInput = scanner.nextLine(); // to collect the user input
            }

            updated = true;

            int val = random.nextInt(1, 4); // this will give 3 possible values of 1, 2 0r 3

            // based on the value of val, you deduce the computer's input
            computerInput = switch (val) {
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "scissors";
            };

            // make comparisons to determine who is the winner
            if (userInput.equals("rock") && computerInput.equals("scissors")) {
                winner = "User";
            } else if (userInput.equals("paper") && computerInput.equals("rock")) {
                winner = "User";
            } else if (userInput.equals("scissors") && computerInput.equals("paper")) {
                winner = "User";
            } else if (userInput.equals(computerInput)) {
                winner = "No winner, please play again";
            } else if (userInput.equals("")) {
                break;
            } else {
                winner = "Computer";
            }

            // announce winner
            System.out.println("User: " + userInput);
            System.out.println("Computer: " + computerInput);
            System.out.println(winner + " wins!");

            // scanning for user input
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            userInput = scanner.nextLine();

        } while (!userInput.equals(""));
    }


}
