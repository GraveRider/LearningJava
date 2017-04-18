public class Main {
    public static void main(String[] args) {
        String word = "algorithm";

        Change change1 = new Change('a', '@');
        Change change2 = new Change('o', '0');

        Changer changer = new Changer();
        changer.addChange(change1);
        changer.addChange(change2);
        System.out.println(changer.change(word));

    }
}
