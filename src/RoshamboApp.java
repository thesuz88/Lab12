import java.util.Scanner;

/**
 * Created by Steve on 7/10/2017.
 */
public class RoshamboApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HumanPlayer humanPlayer = new HumanPlayer();
        RockPlayer theRock = new RockPlayer();
        RandomPlayer theNerd = new RandomPlayer();
        String playAgain = "y";
        String newOpponent = "y";

        System.out.println("Welcome to Rock, Paper, Scissors!\n");

        System.out.print("Enter your name: ");
        humanPlayer.setName(scan.nextLine());

        do {
            System.out.println("Would you like to play against 'The Rock' or 'The Nerd'? (R/N)");
            String aiPlayer = scan.nextLine();

            while (!aiPlayer.equalsIgnoreCase("r") && !aiPlayer.equalsIgnoreCase("n")) {
                System.out.println("I don't know who that is.");
                System.out.println("Would you like to play against 'The Rock' or 'The Nerd'? (R/N) ");
                aiPlayer = scan.nextLine();
            }

            do {
                String userChoice = humanPlayer.generateRoshambo();

                if (aiPlayer.equalsIgnoreCase("r")) {
                    String rock = theRock.generateRoshambo();
                    System.out.println(humanPlayer.getName() + ": " + userChoice);
                    System.out.println("The Rock: " + theRock.generateRoshambo());
                    gameOutcomes(userChoice, rock);

                } else if (aiPlayer.equalsIgnoreCase("n")) {
                    String randomChoice = theNerd.generateRoshambo();
                    System.out.println("\n" + humanPlayer.getName() + ": " + userChoice);
                    System.out.println("The Nerd: " + randomChoice);
                    gameOutcomes(userChoice, randomChoice);
                }
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = scan.nextLine();
            } while (playAgain.equalsIgnoreCase("y"));
            System.out.println("Would you like to select a new opponent ('y' to continue, 'q' to quit)?");
            newOpponent = scan.nextLine();
        } while (newOpponent.equalsIgnoreCase("y"));
        System.out.println("Glad you came to play!");
    }

    public static void gameOutcomes(String userChoice, String pcChoice) {
        if (userChoice == "Rock") {
            if (pcChoice == "Rock") {
                System.out.println("Tie Game!");
            } else if (pcChoice == "Paper") {
                System.out.println("You Lose!");

            } else if (pcChoice == "Scissors") {
                System.out.println("You Win!");
            }
        } else if (userChoice == "Paper") {
            if (pcChoice == "Rock") {
                System.out.println("You Win!");
            } else if (pcChoice == "Paper") {
                System.out.println("Tie Game!");
            } else if (pcChoice == "Scissors") {
                System.out.println("You Lose!");
            }
        } else if (userChoice == "Scissors") {
            if (pcChoice == "Rock") {
                System.out.println("You Lose!");
            } else if (pcChoice == "Paper") {
                System.out.println("You win!");
            } else if (pcChoice == "Scissors") {
                System.out.println("Tie Game!");
            }
        }

    }
}
