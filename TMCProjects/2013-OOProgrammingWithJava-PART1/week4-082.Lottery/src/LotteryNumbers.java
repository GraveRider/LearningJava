import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        int i = 0;
        while (i < 7){
            int number = random.nextInt(39) + 1;
            if (!containsNumber(number)) {
                numbers.add(number);
                i++;
            }
        }

    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
