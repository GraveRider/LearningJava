
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        if (num1 % 2 == 0) {
            System.out.println("Number " + num1 + " is even");
        }
        else {
            System.out.println("Number " + num1 + " is odd");
        }
    }
}
