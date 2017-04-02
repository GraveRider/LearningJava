import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

        System.out.println("Type numbers: ");
        while(true) {
            int num = Integer.parseInt(reader.nextLine());

            if(num == -1) {
                break;
            }
            else {
                if (num % 2 == 0) {
                    evenStats.addNumber(num);
                }
                else {
                    oddStats.addNumber(num);
                }
                stats.addNumber(num);
            }

        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of Odd " + oddStats.sum());
    }
}
