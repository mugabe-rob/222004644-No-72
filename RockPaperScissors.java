import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String playerChoice = scanner.next().toLowerCase();

        if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

            String[] choices = {"rock", "paper", "scissors"};
            String computerChoiceStr = choices[computerChoice];

            System.out.println("Computer chose " + computerChoiceStr);
            System.out.println("You chose " + playerChoice);

            if (playerChoice.equals(computerChoiceStr)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoiceStr.equals("scissors")) ||
                       (playerChoice.equals("scissors") && computerChoiceStr.equals("paper")) ||
                       (playerChoice.equals("paper") && computerChoiceStr.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
        }

        scanner.close();
    }
}
