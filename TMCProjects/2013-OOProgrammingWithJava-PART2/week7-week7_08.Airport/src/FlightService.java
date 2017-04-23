import java.util.Scanner;

public class FlightService {

    private Scanner reader;
    private Airport airport;

    public FlightService(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void startService() {
        System.out.println("Flight service\n"
                + "------------\n");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            System.out.print("> ");
            String operation = reader.nextLine();

            if (operation.equals("x")) {
                break;
            }

            else if (operation.equals("1")) {
                airport.printPlanes();
            }

            else if (operation.equals("2")) {
                airport.printFlights();
            }

            else if (operation.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println(airport.getPlane(planeID));
            }

        }
    }
}
