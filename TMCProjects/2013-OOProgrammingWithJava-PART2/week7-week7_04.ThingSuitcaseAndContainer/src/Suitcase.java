import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
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
        if (things.isEmpty()) {
            return null;
        }
        else {
            Thing heaviestThing = things.get(0);

            for (int i = 0; i < things.size(); i++) {
                if (things.get(i).getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = things.get(i);
                }
            }
            return heaviestThing;
        }

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

