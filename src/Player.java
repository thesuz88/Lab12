/**
 * Created by Steve on 7/10/2017.
 */
public abstract class Player {

    private String name;
    private Roshambo choice;

    public Roshambo getchoice() {
        return choice;
    }

    public void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String generateRoshambo();

    public Roshambo choice() {
        return choice;
    }

}
