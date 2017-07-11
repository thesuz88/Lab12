/**
 * Created by Steve on 7/10/2017.
 */
public abstract class Player {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String generateRoshambo();

}
