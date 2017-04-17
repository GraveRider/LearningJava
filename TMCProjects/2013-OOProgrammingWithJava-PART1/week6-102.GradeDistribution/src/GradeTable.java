import java.util.ArrayList;

public class GradeTable {

    private Grade grade;
    private ArrayList<Grade> gradeList;
    private int[] starList = new int[6];

    public GradeTable() {
        this.gradeList = new ArrayList<Grade>();
    }

    public void addToList(Grade grade) {
        gradeList.add(grade);
    }

    public double acceptance() {
        int accepted = 0;

        if (gradeList.size() == 0) {
            return 0;
        }
        else {
            for (Grade g : gradeList) {
                if (g.getGrade() != 0) {
                    accepted++;
                }
            }
            return (double) 100 * accepted / gradeList.size();
        }
    }

    private void printStars(int howMany) {
        for(int i = 0; i < howMany; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void gradesToArray() {
        for(int i = 0; i < 6; i++) {
            int howMany = 0;
            for(int j = 0; j < gradeList.size(); j++) {
                if(gradeList.get(j).getGrade() == i) {
                    howMany++;
                }
            }
            starList[i] = howMany;
        }
    }

    public void printGradesAsStars() {
        gradesToArray();

        for(int i = 0; i < starList.length; i++) {
            if(starList[starList.length -1 - i] == 0) {
                System.out.println(starList.length - 1 - i + ": " + " ");
            }
            else {
                System.out.print(starList.length -1 - i + ": ");
                printStars(starList[starList.length -1 - i]);
            }
        }
    }
}
