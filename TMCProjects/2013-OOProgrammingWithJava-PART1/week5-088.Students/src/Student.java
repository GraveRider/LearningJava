
public class Student {

    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name + " (" + studentNumber + ")";
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }
}
