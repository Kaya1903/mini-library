public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "Orwell", 300, true);
        Book b2 = new Book("Dune", "Herbert", 500, true);
        Book b3 = new Book("Harry Potter", "Rowling", 400, true);

        Reader r1 = new Reader("Ali", "Kowalski", 1);
        Reader r2 = new Reader("Ayse", "Nowak", 2);

        Library lib = new Library(10);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.printAvailableBooks();
        System.out.println("Available count: " + lib.countAvailableBooks());

        r1.printData();

        System.out.println("\nBorrowing Dune...");
        lib.borrowBook("Dune", r1);

        lib.printAvailableBooks();
        System.out.println("Available count: " + lib.countAvailableBooks());
        r1.printData();

        System.out.println("\nReturning Dune...");
        lib.returnBook("Dune", r1);

        lib.printAvailableBooks();
        System.out.println("Available count: " + lib.countAvailableBooks());
        r1.printData();

        System.out.println("\nSecond reader:");
        r2.printData();
    }
}
