/**
 * Class for calculating leap years using recursion.
 * @author Grave
 * @version 1.0
 */
public class LeapYear {
    private static int counter;

    public static void main(String[] args) {
        calculateLeapYear(2017);
    }

    /**
     * Method which calculates and prints 20 results of leap years from given year.
     * @param year year from which calculate leap years.
     */
    public static void calculateLeapYear(int year) {

        if (year % 4 == 0 && counter < 20) {
            System.out.println(year + " year is leap year");
            counter++;
            year++;
            calculateLeapYear(year);
        } else if(year % 4 != 0){
            year++;
            calculateLeapYear(year);
        }
    }
}
