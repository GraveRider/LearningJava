public class Main {
    public static void main(String[] args) {

        Team bayern = new Team("FC Bayern");
        Player robben = new Player("Robben", 10);
        Player schweinsteiger = new Player("Schweinsteiger", 8);
        Player podolski = new Player("Podolski", 3);

        bayern.setMaxSize(2);
        bayern.addPlayer(robben);
        bayern.addPlayer(schweinsteiger);
        bayern.addPlayer(podolski);

        bayern.printPlayers();
        System.out.println("Total goals: " + bayern.goals());
    }
}
