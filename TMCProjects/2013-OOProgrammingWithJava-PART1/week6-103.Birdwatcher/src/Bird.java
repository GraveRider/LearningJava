
public class Bird {

    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void observation() {
        this.observed++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
}
