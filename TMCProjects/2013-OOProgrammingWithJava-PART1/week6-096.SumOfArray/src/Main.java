
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println("Sum of an array: " + sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        return sum;
    }
}
