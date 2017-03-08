public class Main {
    public static void main(String[] args) {
        // Test your program here
        String word = "labas";

        Change change1 = new Change('a', 'i');
        word = change1.change(word);
        System.out.print(word);

    }
}
