import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = 1;
        int i = 1;

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if (num == 0) {
            System.out.println("Factorial is " + factorial);
        }
        else {
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial is " + factorial);
        }

    }
}
