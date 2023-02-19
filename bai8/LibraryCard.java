import java.time.LocalDate;

public class LibraryCard {
    String id;
    int borrowedDate;
    int returnDate;
    String bookId;
    Student student;

    public LibraryCard(String id, int borrowedDate, int returnDate, String bookId, Student student) {
        this.id = id;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(int borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "id='" + id + '\'' +
                ", borrowedDate=" + borrowedDate +
                ", returnDate=" + returnDate +
                ", bookId='" + bookId + '\'' +
                ", student=" + student +
                '}';
    }
}
