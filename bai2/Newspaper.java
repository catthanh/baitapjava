import java.time.LocalDate;

public class Newspaper extends Document{
    LocalDate dayIssue;

    public Newspaper(String id, String publisher, int numOfCopies, LocalDate dayIssue) {
        super(id, publisher, numOfCopies);
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                '}';
    }
}
