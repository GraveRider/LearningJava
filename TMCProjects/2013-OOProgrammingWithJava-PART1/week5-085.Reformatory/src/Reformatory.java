public class Reformatory {

    private int totalTimesMeasured;

    public int weight(Person person) {
        totalTimesMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return totalTimesMeasured;
    }

}
