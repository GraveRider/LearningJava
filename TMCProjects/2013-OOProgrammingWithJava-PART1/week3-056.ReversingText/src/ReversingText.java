
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reversedText = "";
        int i = 1;

        while (i <= text.length()) {
            reversedText += text.charAt(text.length() - i);
            i++;
        }
        return reversedText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
