
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("a", 15, 160, 60);
        Reformatory ref = new Reformatory();

        ref.feed(p1);
        ref.feed(p1);
        System.out.println(ref.weight(p1));
        System.out.println(ref.totalWeightsMeasured());
    }
}
