
public class Player {

    private String name;
    private int amountOfGoals;


    public Player(String name) {
        this.name = name;
        this.amountOfGoals = 0;
    }

    public Player(String name, int amountOfGoals) {
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountOfGoals;
    }

    public String toString() {
        return name + ", goals " + amountOfGoals;
    }
}
