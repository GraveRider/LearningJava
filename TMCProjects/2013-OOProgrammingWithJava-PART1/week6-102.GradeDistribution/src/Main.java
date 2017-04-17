import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeTable table = new GradeTable();

        System.out.println("Type exam scores, -1 completes: ");
        while(true) {
            int score = Integer.parseInt(reader.nextLine());

            if(score == -1) {
                break;
            }
            else if(score < -1 || score > 60) {
                System.out.println("Invalid score! Try again: ");
            }

            else {

                table.addToList(new Grade(score));
            }
        }

        System.out.println("Grade distribution: ");
        table.printGradesAsStars();
        System.out.print("Acceptance percentage: " + table.acceptance());
    }
}
