
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {

    }

    public void addNumber(int number) {
        sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        if (amountOfNumbers == 0) {
            return 0;
        }
        else {
            return sum;
        }
    }

    public double average() {
        if (amountOfNumbers == 0) {
            return 0;
        }
        else {
            return (double) sum / amountOfNumbers;
        }
    }
}
