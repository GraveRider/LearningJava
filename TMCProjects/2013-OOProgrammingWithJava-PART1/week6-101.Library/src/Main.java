public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Der Antichrist", "Friedrich Nietzsche",1895);
        Book book2 = new Book("Das Kapital", "Karl Marx", 1867);

        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();
        System.out.println("Found: " + library.searchByTitle(" kapital "));
    }
}
