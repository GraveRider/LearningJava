
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Enter temperature: ");
            double temperature = Double.parseDouble(reader.nextLine());
            if (-30 <= temperature && temperature <= 40) {
                Graph.addNumber(temperature);
            }
        }
    }
}