import java.util.Random;

/**
 * Created by Steve on 7/10/2017.
 */
public class RandomPlayer extends Player {


    @Override
    public String generateRoshambo() {
        int x = 0;
        Random y = new Random();

        int randomNum = y.nextInt(3) + 1;

        if (randomNum == 1) {
            return "Rock";
        }
        else if (randomNum == 2) {
            return "Paper";
        }
        else if (randomNum == 3) {
            return "Scissors";
        }
        else {
            return null;
        }
    }
}
