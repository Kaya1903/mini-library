public class Book {

    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println(title + " by " + author + " (" + pageCount + " pages)"
                + " | available: " + available);
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is not available: " + title);
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned: " + title);
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}
