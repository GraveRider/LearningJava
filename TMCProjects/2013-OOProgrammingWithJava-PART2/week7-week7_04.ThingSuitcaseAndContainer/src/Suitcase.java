import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int totalWeight;

    public Suitcase(int maxWeight) {

        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight <= maxWeight) {
            totalWeight += thing.getWeight();
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Thing heaviestThing() {
        Thing heaviestThing = things.get(0);

        for (Thing thing : things) {
            if (thing.getWeight() > heaviestThing.getWeight()) {
                heaviestThing = thing;
            }
            return heaviestThing;
        }
        return null;
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight + " kg)";
        }
        return things.size() + " things (" + totalWeight + "kg)";
    }
}

