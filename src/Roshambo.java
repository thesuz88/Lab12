/**
 * Created by Steve on 7/10/2017.
 */
public enum Roshambo{
    ROCK, PAPER, SCISSORS;

    @Override
    public String toString() {
        switch (this){
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            case SCISSORS:
                return "Scissors";
            default: throw new IllegalArgumentException();
        }
    }
}
