
public class Grade {

    private int grade;

    public Grade(int score) {
        if(score > 0 && score < 30) {
            this.grade = 0;
        }
        else if(score < 35) {
            this.grade = 1;
        }

        else if(score < 40) {
            this.grade = 2;
        }

        else if(score < 45) {
            this.grade = 3;
        }

        else if(score < 50) {
            this.grade = 4;
        }
        else {
            this.grade = 5;
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public String toString() {
        return this.grade + "";
    }
}
