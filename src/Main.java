public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "Orwell", 300, true);
        Book b2 = new Book("Dune", "Herbert", 500, true);
        Book b3 = new Book("Harry Potter", "Rowling", 400, true);

        b1.printInfo();
        b1.borrow();
        b1.returnBook();
    }
}