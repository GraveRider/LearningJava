
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        AirportPanel panel = new AirportPanel(reader, airport);
        FlightService service = new FlightService(reader, airport);
        panel.startPanel();
        service.startService();
        reader.close();
    }
}
