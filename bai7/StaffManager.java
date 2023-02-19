import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManager {
    List<Staff> staffs;

    public StaffManager() {
        staffs = new ArrayList<>();
    }

    public void addStaff(String id, String name, int age, String placeOfBirth, double hardSalary, double bonus, double penalty) {
        staffs.add(new Staff(id, name, age, placeOfBirth, hardSalary, bonus, penalty));
    }

    public void removeStaff(String id) {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getId().equals(id)) {
                staffs.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaffManager staffManager = new StaffManager();
        boolean running = true;
        while (running) {
            System.out.println("1. Add staff");
            System.out.println("2. Remove staff");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter staff id: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter staff name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter staff age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter staff place of birth: ");
                    String placeOfBirth = scanner.nextLine();
                    System.out.print("Enter staff hard salary: ");
                    double hardSalary = scanner.nextDouble();
                    System.out.print("Enter staff bonus: ");
                    double bonus = scanner.nextDouble();
                    System.out.print("Enter staff penalty: ");
                    double penalty = scanner.nextDouble();
                    staffManager.addStaff(id, name, age, placeOfBirth, hardSalary, bonus, penalty);
                }
                case 2 -> {
                    System.out.print("Enter staff id: ");
                    String id = scanner.nextLine();
                    staffManager.removeStaff(id);
                }
                case 3 -> running = false;
            }
        }
    }
}
