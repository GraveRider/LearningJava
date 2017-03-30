public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.reset();
        counter.setInitial();
        counter.printValue();
    }
}
