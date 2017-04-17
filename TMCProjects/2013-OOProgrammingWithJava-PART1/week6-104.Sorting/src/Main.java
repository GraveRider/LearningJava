import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {15, -10, -20, 13, 4};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);

        for(int i = 0; i < array.length; i++) {
            if(array[i] == smallest) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int indexOfTheSmallest = index;

        for(int i = index; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, smallest, i);
        }

    }
}
