
public class Main {

    public static void main(String[] args) {
        Money a = new Money(3, 5);
        Money b = new Money(5, 75);

        System.out.println("Is less: " + a.less(b));
        System.out.println("Total money: " + a.plus(b));
        System.out.println("Total money: " + b.minus(a));
    }
}
