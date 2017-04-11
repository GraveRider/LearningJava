
public class Taskas {

    private Input reader = new Input();
    private double x;
    private double y;

    public Taskas() {
        System.out.println("Enter x: ");
        x = reader.input();
        System.out.println("Enter y: ");
        y = reader.input();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public static double distance(Taskas a, Taskas b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
