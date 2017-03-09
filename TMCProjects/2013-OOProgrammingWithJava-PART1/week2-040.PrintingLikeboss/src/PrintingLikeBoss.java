public class PrintingLikeBoss {


    public static void printStars(int amount) {
        int i = 0;
        while(i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
       int i = 1;
       int amount = 1;
       while (i <= height) {
           printWhitespaces(height - i);
           printStars(amount);
           i++;
           amount += 2;
       }
        printWhitespaces(amount / 2 - 2);
        printStars(3);
        printWhitespaces(amount / 2 - 2 );
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);

    }
}
