
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sum = 0;

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        while (i <= num) {
            sum += Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + sum);

    }
}
