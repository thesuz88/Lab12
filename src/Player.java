/**
 * Created by Steve on 7/10/2017.
 */
public abstract class Player {

    private String name;
    private String choice;

    public String getchoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String generateRoshambo();

    public String choice() {
        return choice;
    }

}
