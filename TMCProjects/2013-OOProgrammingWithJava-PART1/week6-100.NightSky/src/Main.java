
public class Main {

    public static void main(String[] args) {
        NightSky sky = new NightSky(0.4, 20, 14);

        sky.print();
        System.out.println("Stars: " + sky.starsInLastPrint());
    }
}
