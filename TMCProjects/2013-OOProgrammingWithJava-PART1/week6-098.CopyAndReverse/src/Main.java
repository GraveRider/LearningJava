import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = copy(array);
        int[] reverse = reverseCopy(array);

        System.out.println("Copied array: " + Arrays.toString(copy));
        System.out.println("Reversed array: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }
    
}
