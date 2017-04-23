import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private ArrayList<Plane> planes;
    private HashMap<Flight, Plane> flights;

    public Airport() {
        this.planes = new ArrayList<Plane>();
        this.flights = new HashMap<Flight, Plane>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public Plane getPlane(String planeID) {
        for (Plane plane : planes) {
            if (plane.getPlaneId().equals(planeID)) {
                return plane;
            }
        }
        return null;
    }


    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    public void addFlight(Flight flight, Plane plane) {
        flights.put(flight, plane);
    }

    public void printFlights() {
        for (Flight flight : flights.keySet()) {
            System.out.println(flights.get(flight) + " " + flight);
        }
    }
}
