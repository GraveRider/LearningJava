
import java.util.Scanner;

public class Input {

    private Scanner reader;

    public Input () {
        reader = new Scanner(System.in);
    }

    public double input() {
        return Double.parseDouble(reader.nextLine());

    }

}
