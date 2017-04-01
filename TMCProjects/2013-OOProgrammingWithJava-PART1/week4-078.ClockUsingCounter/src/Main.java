
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);

        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);

        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int min = Integer.parseInt(reader.nextLine());
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(min);
        hours.setValue(h);

        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }




    }
}
