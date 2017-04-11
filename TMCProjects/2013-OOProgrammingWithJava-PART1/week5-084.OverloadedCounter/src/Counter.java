
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.value = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        if (check && value > 0) {
            value--;
        }
        else if (!check) {
            value--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (check && value > 0 && decreaseAmount >= 0) {
            value -= decreaseAmount;
            if (value < 0) {
                value = 0;
            }
        } else if (!check && decreaseAmount >= 0) {
            value -= decreaseAmount;
        }
    }
}
