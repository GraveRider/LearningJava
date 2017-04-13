import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (players.size() < maxSize) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player p : players) {
            totalGoals += p.goals();
        }
        return  totalGoals;
    }
}
