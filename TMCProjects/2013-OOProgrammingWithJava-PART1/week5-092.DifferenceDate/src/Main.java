
public class Main {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(25, 11, 2000);
        MyDate date2 = new MyDate(15, 9, 2005);

        System.out.println("Difference in years: " + date1.differenceInYears(date2));
    }
}
