import java.util.Scanner;

/**
 * Created by Steve on 7/10/2017.
 */
public class HumanPlayer extends Player {
    Scanner s = new Scanner(System.in);

    @Override
    public String generateRoshambo() {

        System.out.println("Choose Rock, Paper, or Scissor: (R/P/S) ");
        String rpsInput = s.nextLine();

        //method to validate the users choice of r/p/s
        rpsInput = validateChoice(rpsInput);

        if (rpsInput.equalsIgnoreCase("r")) {
            return Roshambo.ROCK.toString();
        }
        if (rpsInput.equalsIgnoreCase("p")) {
            return Roshambo.PAPER.toString();
        }
        if (rpsInput.equalsIgnoreCase("s")) {
            return Roshambo.SCISSORS.toString();
        }
        else{
            return null;
        }
    }

    private String validateChoice(String rpsInput) {
        while (!rpsInput.equalsIgnoreCase("r") && !rpsInput.equalsIgnoreCase("p") &&
                !rpsInput.equalsIgnoreCase("s")) {
            System.out.println("Invalid input.");
            System.out.println("Choose Rock, Paper, or Scissor: (R/P/S)");
            rpsInput = s.nextLine();
        }
        return rpsInput;
    }

}
