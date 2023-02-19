import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryManager {
     private Map<String, Document> library;

    public LibraryManager() {
        this.library = new HashMap<>();
    }

    public boolean containsId(String id) {
        return library.containsKey(id);
    }

    public boolean add(Document doc) {
        if(library.containsKey(doc.getId())) return false;
        library.put(doc.getId(), doc);
        return true;
    }

    public Document remove(String docId) {
        return library.remove(docId);
    }

    public String info(String docId) {
        if(library.containsKey(docId))
            return library.get(docId).toString();
        else {
            return "documents not found";
        }
    }

    public <T extends Document> List<Document> searchByType(Class<T> c) {
        return library.values().stream().filter(c::isInstance).toList();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Library Manager Program");
        LibraryManager libraryManager = new LibraryManager();
        boolean running = true;
        while (running) {
            System.out.println("Enter 1: To add document");
            System.out.println("Enter 2: To remove document: ");
            System.out.println("Enter 3: To show information about a doc");
            System.out.println("Enter 4: To search document by type");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter Document Id");
                    String id = scanner.nextLine();
                    if (libraryManager.containsId(id)) {
                        System.out.println("This id have already existed");
                        break;
                    }
                    System.out.println("Enter Document Publisher");
                    String publisher = scanner.nextLine();
                    System.out.println("Enter Number Of Copies");
                    int numsOfCopy = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Document type: (1 for Book, 2 for Magazine, 3 for Newspaper)");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            System.out.println("Enter Book's author");
                            String author = scanner.nextLine();
                            System.out.println("Enter number of pages");
                            int numsOfPages = Integer.parseInt(scanner.nextLine());
                            libraryManager.add(new Book(id, publisher, numsOfCopy, author, numsOfPages));
                            break;
                        }
                        case "2": {
                            System.out.println("Enter Magazine's issue number");
                            int issueNumber = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Year");
                            int year = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Month");
                            int month = Integer.parseInt(scanner.nextLine());
                            libraryManager.add(new Magazine(id, publisher, numsOfCopy, YearMonth.of(year,month), issueNumber));
                            break;
                        }
                        case "3": {
                            System.out.println("Enter Newspaper's issue day:");
                            System.out.println("Enter Day");
                            int day = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Year");
                            int year = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Month");
                            int month = Integer.parseInt(scanner.nextLine());
                            libraryManager.add(new Newspaper(id, publisher, numsOfCopy, LocalDate.of(year,month,day)));
                            break;
                        }
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter documentId:");
                    String docId = scanner.nextLine();
                    if(libraryManager.remove(docId)==null) {
                        System.out.println("Document removed");
                    } else {
                        System.out.println("Document not found");
                    }
                    break;
                }

                case "3": {
                    System.out.println("Enter documentId:");
                    String docId = scanner.nextLine();
                    System.out.println(libraryManager.info(docId));
                    break;
                }
                case "4": {
                    System.out.println("Enter Document type: (1 for Book, 2 for Magazine, 3 for Newspaper, 0 for all)");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            System.out.println(libraryManager.searchByType(Book.class));
                            break;
                        }
                        case "2": {
                            System.out.println(libraryManager.searchByType(Magazine.class));
                            break;
                        }
                        case "3": {
                            System.out.println(libraryManager.searchByType(Newspaper.class));
                            break;
                        }
                        case "0": {
                            System.out.println(libraryManager.searchByType(Document.class));
                            break;
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("existing..");
                    running = false;
                    break;
                }
            }
        }
    }
}
