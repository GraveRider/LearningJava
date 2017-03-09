
import java.util.Scanner;

public class ManyPrints {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.println("How many?");
        int times = Integer.parseInt(reader.nextLine());

        while (i < times) {
            printText();
            i++;
        }
    }
}