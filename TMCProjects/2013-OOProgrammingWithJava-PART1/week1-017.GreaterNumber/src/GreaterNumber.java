import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        double num1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type the second number: ");
        double num2 = Double.parseDouble(reader.nextLine());

        if (num1 > num2) {
            System.out.println("Greater number " + num1);
        }
        else if (num1 < num2) {
            System.out.println("Greater number " + num2);
        }
        else {
            System.out.println("The numbers are equal!");
        }

    }
}
