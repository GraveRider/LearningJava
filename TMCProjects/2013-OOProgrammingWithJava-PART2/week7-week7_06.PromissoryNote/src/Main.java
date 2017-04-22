
public class Main {
    public static void main(String[] args) {
        PromissoryNote note = new PromissoryNote();

        note.setLoan("Robert", 500.40);
        note.setLoan("Robert", 350);
        System.out.println("Total debt: " + note.howMuchIsTheDebt("Robert"));
        System.out.println("Total debt: " + note.howMuchIsTheDebt("Alex"));

    }
}
