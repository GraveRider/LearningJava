
public class Main {

    public static void main(String[] args) {
      Phonebook book = new Phonebook();

      book.add("John", "555-1234");
      book.add("Dave", "555-2345");

      System.out.println(book.searchNumber("Dave"));
      book.printAll();
    }
}
