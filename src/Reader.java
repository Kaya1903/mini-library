public class Reader {

    private String name;
    private int readerId;

    public Reader(String name, int readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    public void printInfo() {
        System.out.println("Reader: " + name + ", ID: " + readerId);
    }
}