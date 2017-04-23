
public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.regCode != compared.regCode) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.country)
                || this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.country == null || this.regCode == null) {
            return 7;
        }
        return this.regCode.hashCode() + this.country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

}