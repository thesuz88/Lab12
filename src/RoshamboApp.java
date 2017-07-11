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

        //Stores name in Player class
        System.out.print("Enter your name: ");
        humanPlayer.setName(scan.nextLine());

        do {
            System.out.println("Would you like to play against 'The Rock' or 'The Nerd'? (R/N)");
            String aiPlayer = scan.nextLine();

            //method to validate the user selected a valid player option
            aiPlayer = validatePlayer(scan, aiPlayer);

            do {
                //generates the string output based on what the user input
                String userChoice = humanPlayer.generateRoshambo();

                //if the user chose to play with "the rock" this method uses RockPlayer class
                if (aiPlayer.equalsIgnoreCase("r")) {
                    playWithTheRock(humanPlayer, theRock, userChoice);

                }
                //if the user chose to play with "The nerd" this method uses the RandomPlayer class
                else if (aiPlayer.equalsIgnoreCase("n")) {
                    playWithTheNerd(humanPlayer, theNerd, userChoice);
                }

                System.out.println("Would you like to play again? (Y/N)");
                playAgain = scan.nextLine();

            } while (playAgain.equalsIgnoreCase("y"));

            System.out.println("Would you like to select a new opponent ('y' to continue, 'q' to quit)?");
            newOpponent = scan.nextLine();

            //validates if the user typed a 'y' or a 'q'
            newOpponent = validateNewOpponent(scan, newOpponent);

        } while (newOpponent.equalsIgnoreCase("y"));

        System.out.println("Glad you came to play!");
    }

    private static String validateNewOpponent(Scanner scan, String newOpponent) {
        while (!newOpponent.equalsIgnoreCase("y") && !newOpponent.equalsIgnoreCase("q")) {
            System.out.println("Type 'y' to continue, 'q' to quit");
            newOpponent = scan.nextLine();
        }
        return newOpponent;
    }

    private static String validatePlayer(Scanner scan, String aiPlayer) {
        while (!aiPlayer.equalsIgnoreCase("r") && !aiPlayer.equalsIgnoreCase("n")) {
            System.out.println("I don't know who that is.");
            System.out.println("Would you like to play against 'The Rock' or 'The Nerd'? (R/N) ");
            aiPlayer = scan.nextLine();
        }
        return aiPlayer;
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

    private static void playWithTheNerd(HumanPlayer humanPlayer, RandomPlayer theNerd, String userChoice) {
        String randomChoice = theNerd.generateRoshambo();
        System.out.println("\n" + humanPlayer.getName() + ": " + userChoice);
        System.out.println("The Nerd: " + randomChoice);
        gameOutcomes(userChoice, randomChoice);
    }

    private static void playWithTheRock(HumanPlayer humanPlayer, RockPlayer theRock, String userChoice) {
        String rock = theRock.generateRoshambo();
        System.out.println(humanPlayer.getName() + ": " + userChoice);
        System.out.println("The Rock: " + theRock.generateRoshambo());
        gameOutcomes(userChoice, rock);
    }
}
