
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Type the first number: ");
        int read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Type the second number: ");
            read = Integer.parseInt(reader.nextLine());
            sum += read;

            System.out.println("Type the third number: ");
            read = Integer.parseInt(reader.nextLine());
            sum += read;

        System.out.println("Sum: " + sum);
    }
}
