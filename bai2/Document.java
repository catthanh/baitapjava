public class Document {
    protected String id;
    protected String publisher;
    protected int numOfCopies;

    public Document(String id, String publisher, int numOfCopies) {
        this.id = id;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                '}';
    }
}
