
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name = "";
        String studentNumber = "";

        while(true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("student number: ");
            studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }

        for (Student st : students) {
            System.out.println(st);
        }

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();

        System.out.println("Result: ");
        for (Student st : students) {
            if(st.getName().contains(searchTerm)) {
                System.out.println(st);
            }
        }
    }
}