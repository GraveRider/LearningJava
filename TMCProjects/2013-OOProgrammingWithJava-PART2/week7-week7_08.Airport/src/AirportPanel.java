import java.util.Scanner;

public class AirportPanel {

    private Scanner reader;
    private Airport airport;

    public AirportPanel(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;

    }

    public void startPanel() {
        System.out.println("Airport panel\n" +
                "--------------------\n");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");

            System.out.print("> ");
            String operation = reader.nextLine();

            if(operation.equals("x")) {
                break;
            }

            else if(operation.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                Plane plane = new Plane(planeID, capacity);
                airport.addPlane(plane);
            }

            else if(operation.equals("2")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                Plane plane = airport.getPlane(planeID);
                System.out.print("Give departure airport code: ");
                String departureCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationCode = reader.nextLine();
                airport.addFlight(new Flight(departureCode, destinationCode), plane);
            }
        }
    }

}
