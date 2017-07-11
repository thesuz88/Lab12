import java.util.Random;

/**
 * Created by Steve on 7/10/2017.
 */
public class RandomPlayer extends Player {


    @Override
    public String generateRoshambo() {
        int x = 0;
        Random y = new Random();

        //random number generator to choose a number 1-3 inclusive.
        //Random class starts at 0 and exclusively goes up to bound, which is why we add 1
        int randomNum = y.nextInt(3) + 1;

        if (randomNum == 1) {
            return Roshambo.ROCK.toString();
        }
        else if (randomNum == 2) {
            return Roshambo.PAPER.toString();
        }
        else if (randomNum == 3) {
            return Roshambo.SCISSORS.toString();
        }
        else {
            return null;
        }
    }
}
