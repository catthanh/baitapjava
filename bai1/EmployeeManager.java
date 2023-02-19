import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManager {
    List<Employee> employeeList;

    EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> search(String keyword) {
        return employeeList.stream().filter(employee -> employee.getName().contains(keyword)).toList();
    }

    public String employeeListInfo() {
        return employeeList.stream().map(Object::toString).collect(Collectors.joining("/n"));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Manager Program");
        EmployeeManager employeeManager = new EmployeeManager();
        boolean running = true;
        while (running) {
            System.out.println("Enter 1: To add employee");
            System.out.println("Enter 2: To search employee by name: ");
            System.out.println("Enter 3: To show information");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter Employee's full name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Employee's age");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Employee gender: (1 for Male, 2 for Female, 3 for Other)");
                    int genderInt = Integer.parseInt(scanner.nextLine());
                    Employee.Gender gender = (genderInt == 0) ?
                            Employee.Gender.MALE : (genderInt == 1) ?
                            Employee.Gender.FEMALE : Employee.Gender.OTHER;
                    System.out.println("Enter Employee's address");
                    String address = scanner.nextLine();
                    System.out.println("Enter Employee type: (1 for Worker, 2 for Engineer, 3 for Staff)");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            System.out.println("Enter Worker's level");
                            String levelString = scanner.nextLine();
                            int level = Integer.parseInt(levelString);
                            employeeManager.add(new Worker(name, age, gender, address, level));
                            break;
                        }
                        case "2": {
                            System.out.println("Enter Engineer's major");
                            String major = scanner.nextLine();
                            employeeManager.add(new Engineer(name, age, gender, address, major));
                            break;
                        }
                        case "3": {
                            System.out.println("Enter Staff's task");
                            String task = scanner.nextLine();
                            employeeManager.add(new Staff(name, age, gender, address, task));
                            break;
                        }
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter keyword:");
                    String keyword = scanner.nextLine();
                    System.out.println(employeeManager.search(keyword));
                    break;
                }

                case "3": {
                    System.out.println(employeeManager.employeeListInfo());
                    break;
                }
                case "4": {
                    System.out.println("existing..");
                    running = false;
                    break;
                }
            }
        }
    }
}
