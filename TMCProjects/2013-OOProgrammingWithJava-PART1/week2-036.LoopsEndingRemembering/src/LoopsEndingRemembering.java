import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int totalNums = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers:");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());

            if (num == -1) {
                System.out.println("Thank you and see you later!");
                average = (double) sum / totalNums;
                break;
            }
            else {
                sum += num;
                totalNums++;
                if (num % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + totalNums);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
