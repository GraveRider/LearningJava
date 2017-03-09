
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        System.out.println(calculateCharacters(name));
    }
    

    public static int calculateCharacters(String name) {
        return name.length();
    }
    
}
