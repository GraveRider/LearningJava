import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() >= 3) {
            while (i < 4) {
                System.out.println(i + ". character: " + name.charAt(i - 1));
                i++;
            }
        }
    }
}
