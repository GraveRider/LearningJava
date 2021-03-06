import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if (weight() + thing.weight() <= this.maxWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing : things) {
            weight += thing.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + weight() + " kg";
    }
}
