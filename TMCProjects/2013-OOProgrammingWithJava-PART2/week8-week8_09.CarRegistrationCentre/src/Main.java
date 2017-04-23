
public class Main {

    public static void main(String[] args) {

        VehicleRegister register = new VehicleRegister();

        register.add(new RegistrationPlate("D", "DUA - 465"), "Hans");
        register.add(new RegistrationPlate("UK", "GTY - 856"), "John");
        register.printRegistrationPlates();
        register.printOwners();
    }
}
