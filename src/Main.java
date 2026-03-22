public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "Orwell", 300, true);
        Book b2 = new Book("Dune", "Herbert", 500, true);
        Book b3 = new Book("Harry Potter", "Rowling", 400, true);

        b1.printInfo();
        b1.borrow();
        b1.returnBook();

        Reader r1 = new Reader("Ali", 1);
        Reader r2 = new Reader("Ayşe", 2);

        r1.printInfo();
        r2.printInfo();

Library lib = new Library(10);

lib.addBook(b1);
lib.addBook(b2);
lib.addBook(b3);

lib.printAvailableBooks();

System.out.println("Total books: " + lib.countAvailableBooks());
    }
}