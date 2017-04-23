public class Main {
    public static void main(String[] args) {
        CivilService civil = new CivilService();
        MilitaryService military = new MilitaryService(5);

        civil.work();
        System.out.println(civil.getDaysLeft());

        military.work();
        System.out.println(military.getDaysLeft());
    }
}
