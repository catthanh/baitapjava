import java.time.YearMonth;
import java.util.Date;

public class Magazine extends Document{

    YearMonth issueMonth;
    int issueNumber;

    public Magazine(String id, String publisher, int numOfCopies, YearMonth issueMonth, int issueNumber) {
        super(id, publisher, numOfCopies);
        this.issueMonth = issueMonth;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueMonth=" + issueMonth +
                ", issueNumber='" + issueNumber + '\'' +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                '}';
    }
}
