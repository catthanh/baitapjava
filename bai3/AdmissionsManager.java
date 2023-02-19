import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdmissionsManager {
    List<Candidate> candidateList;

    public AdmissionsManager() {
        candidateList = new ArrayList<>();
    }

    public boolean add(Candidate c) {
        return candidateList.add(c);
    }

    public Candidate searchById(String id) {
        return this.candidateList.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }

    public String candidateListInfo() {
        return candidateList.stream().map(Object::toString).collect(Collectors.joining("/n"));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("AdmissionsManager Manager Program");
        AdmissionsManager admissionsManager = new AdmissionsManager();
        boolean running = true;
        while (running) {
            System.out.println("Enter 1: To add a candidate");
            System.out.println("Enter 2: To show information ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter Candidate Id");
                    String id = scanner.nextLine();
                    if (admissionsManager.searchById(id)!=null) {
                        System.out.println("This id have already existed");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Priotity: ");
                    int priority = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Candidate Group: (1 for Group A, 2 for Group B, 3 for Group C)");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            admissionsManager.add(new Candidate(id, name, address, priority, Group.A()));
                            break;
                        }
                        case "2": {
                            admissionsManager.add(new Candidate(id, name, address, priority, Group.B()));
                            break;
                        }
                        case "3": {
                            admissionsManager.add(new Candidate(id, name, address, priority, Group.C()));
                            break;
                        }
                    }
                    break;
                }

                case "2": {
                    System.out.println(admissionsManager.candidateListInfo());
                }

                case "3": {
                    System.out.println("Enter documentId:");
                    String id = scanner.nextLine();
                    System.out.println(admissionsManager.searchById(id));
                    break;
                }
                case "4":{
                    System.out.println("existing..");
                    running = false;
                    break;
                }
            }
        }
    }
}
