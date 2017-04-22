import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: " + "\n" + "\t"
                + " add - adds a word pair to the dictionary" + "\n" + "\t"
                + "translate - asks a word and prints its translation" + "\n" + "\t"
                + "quit - quits the text user interface" + "\n");

        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                System.out.print("In German: ");
                String germanWord = reader.nextLine();
                System.out.print("Translation: ");
                String englishWord = reader.nextLine();
                dictionary.add(germanWord, englishWord);
            } else if (statement.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            } else {
                System.out.println("Unknown statement!");
            }
        }

    }
}
