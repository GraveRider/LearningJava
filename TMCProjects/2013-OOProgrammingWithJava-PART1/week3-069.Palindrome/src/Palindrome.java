import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String text) {
        String reversedText = "";
        for (int i = 1; i <= text.length(); i++) {
            reversedText += text.charAt(text.length() - i);
        }
        if (text.equals(reversedText)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
