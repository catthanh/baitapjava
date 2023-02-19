public class Book extends Document{
    private String authorName;
    private int numOfPages;

    public Book(String id, String publisher, int numOfCopies, String authorName, int numOfPages) {
        super(id, publisher, numOfCopies);
        this.authorName = authorName;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", numOfPages=" + numOfPages +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                '}';
    }
}
