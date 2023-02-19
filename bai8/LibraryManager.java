import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    List<LibraryCard> libraryCards;

    LibraryManager() {
        libraryCards = new ArrayList<>();
    }

    public void addLibraryCard(LibraryCard libraryCard) {
        libraryCards.add(libraryCard);
    }

    public void editLibraryCard(String cardId, int borrowedDate, int returnDate, String bookId, Student student) {
        for (LibraryCard libraryCard : libraryCards) {
            if (libraryCard.getId().equals(cardId)) {
                libraryCard.setBorrowedDate(borrowedDate);
                libraryCard.setReturnDate(returnDate);
                libraryCard.setBookId(bookId);
                libraryCard.setStudent(student);
                return;
            }
        }
        System.out.println("Library card ID not found");
    }

    public void deleteLibraryCard(String cardId) {
        for (LibraryCard libraryCard : libraryCards) {
            if (libraryCard.getId().equals(cardId)) {
                libraryCards.remove(libraryCard);
                return;
            }
        }
        System.out.println("Library card ID not found");
    }

    public void showAllLibraryCards() {
        for (LibraryCard libraryCard : libraryCards) {
            System.out.println(libraryCard);
        }
    }

    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Add new library card");
            System.out.println("2. Edit library card");
            System.out.println("3. Delete library card");
            System.out.println("4. Show all library cards");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter card ID: ");
                    String cardId = scanner.nextLine();
                    System.out.println("Enter borrowed date: ");
                    int borrowedDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter return date: ");
                    int returnDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.println("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter student age: ");
                    int studentAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter student class name: ");
                    String studentClassName = scanner.nextLine();
                    Student student = new Student(studentName, studentAge, studentClassName);
                    LibraryCard libraryCard = new LibraryCard(cardId, borrowedDate, returnDate, bookId, student);
                    libraryManager.addLibraryCard(libraryCard);
                    break;
                case 2:
                    System.out.println("Enter card ID: ");
                    cardId = scanner.nextLine();
                    System.out.println("Enter borrowed date: ");
                    borrowedDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter return date: ");
                    returnDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter book ID: ");
                    bookId = scanner.nextLine();
                    System.out.println("Enter student name: ");
                    studentName = scanner.nextLine();
                    System.out.println("Enter student age: ");
                    studentAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter student class name: ");
                    studentClassName = scanner.nextLine();
                    student = new Student(studentName, studentAge, studentClassName);
                    libraryManager.editLibraryCard(cardId, borrowedDate, returnDate, bookId, student);
                    break;
                case 3:
                    System.out.println("Enter card ID: ");
                    cardId = scanner.nextLine();
                    libraryManager.deleteLibraryCard(cardId);
                    break;
                case 4:
                    libraryManager.showAllLibraryCards();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
