import java.util.*;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> vehicles;

    public VehicleRegister() {
        this.vehicles = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!vehicles.containsKey(plate)) {
            vehicles.put(plate, owner);
            return true;
        }

        return false;
    }

    public String get(RegistrationPlate plate) {
        if (vehicles.containsKey(plate)) {
            return vehicles.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (vehicles.containsKey(plate)) {
            vehicles.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : vehicles.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> owners = new HashSet<String>();

        for (RegistrationPlate plate : vehicles.keySet()) {
            owners.add(vehicles.get(plate));
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
