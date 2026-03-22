public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            count++;
        }
        return count;
    }
}