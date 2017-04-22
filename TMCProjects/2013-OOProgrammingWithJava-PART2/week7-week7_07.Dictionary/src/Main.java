
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "help\n" + "add\n" + "Morgen\n"
                + "Morning\n" + "translate\n" + "Morgen\n" + "quit";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
        reader.close();
    }
}
