import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private int weight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public int getWeight() {
        return this.weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.weight <= maxWeight) {
           this.weight += suitcase.totalWeight();
           suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for(Suitcase s : suitcases) {
            s.printThings();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.weight + " kg)";
    }
}

