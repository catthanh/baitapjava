import Entity.*;
import Helper.Validator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
    Map<String, Employee> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    public void editEmployee(String id, Employee employee) {
        if(employees.containsKey(id)) {
            employees.replace(id, employee);
        } else {
            System.out.println("Entity.Employee not found!");
        }
    }

    public void deleteEmployee(String id) {
        if(employees.containsKey(id)) {
            employees.remove(id);
        } else {
            System.out.println("Entity.Employee not found!");
        }
    }

    List<Employee> searchEmployeeByType(EmployeeType employeeType) {
        return employees.values().stream().filter(employee -> employee.getEmployeeType() == employeeType).toList();
    }

    public void addCertificate(String id, Certificate certificate) {
        if(employees.containsKey(id)) {
            employees.get(id).addCertificate(certificate);
        } else {
            System.out.println("Entity.Employee not found!");
        }
    }

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Add new employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Search employee by type");
            System.out.println("5. Add certificate");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1. Fresher");
                    System.out.println("2. Experience");
                    System.out.println("3. Intern");
                    System.out.print("Enter your choice: ");
                    int choice1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    if(!Validator.validateName(name)) {
                        System.out.println("Invalid name!");
                        break;
                    }
                    System.out.print("Enter birthday: ");
                    String birthday = scanner.nextLine();
                    if(!Validator.validateBirthday(birthday)) {
                        System.out.println("Invalid birthday!");
                        break;
                    }
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    if(!Validator.validatePhone(phone)) {
                        System.out.println("Invalid phone!");
                        break;
                    }
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    if(!Validator.validateEmail(email)) {
                        System.out.println("Invalid email!");
                        break;
                    }
                    switch (choice1) {
                        case 1:
                            System.out.print("Enter graduation rank: ");
                            String graduationRank = scanner.nextLine();
                            System.out.print("Enter education: ");
                            String education = scanner.nextLine();
                            try {
                                Fresher fresher = new Fresher(name, birthday, phone, email, graduationRank, education);
                                employeeManager.addEmployee(fresher);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Enter exp in year: ");
                            int expInYear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter pro skill: ");
                            String proSkill = scanner.nextLine();
                            try {
                                Experience experience = new Experience(name, birthday, phone, email, expInYear, proSkill);
                                employeeManager.addEmployee(experience);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.print("Enter major: ");
                            String major = scanner.nextLine();
                            System.out.print("Enter semester: ");
                            String semester = scanner.nextLine();
                            System.out.print("Enter university name: ");
                            String universityName = scanner.nextLine();
                            try {
                                Intern intern = new Intern(name, birthday, phone, email, major, semester, universityName);
                                employeeManager.addEmployee(intern);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    String id = scanner.nextLine();
                    if (employeeManager.getEmployee(id) != null) {
                        employeeManager.getEmployee(id).showMe();
                        System.out.println("Edit name? (y/n)");
                        String choice2 = scanner.nextLine();
                        if (choice2.equals("y")) {
                            System.out.print("Enter name: ");
                            String newName = scanner.nextLine();
                            try {
                                employeeManager.getEmployee(id).setName(newName);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        System.out.println("Edit birthday? (y/n)");
                        String choice3 = scanner.nextLine();
                        if (choice3.equals("y")) {
                            System.out.print("Enter birthday: ");
                            String newBirthday = scanner.nextLine();
                            try {
                                employeeManager.getEmployee(id).setBirthday(newBirthday);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        System.out.println("Edit phone? (y/n)");
                        String choice4 = scanner.nextLine();
                        if (choice4.equals("y")) {
                            System.out.print("Enter phone: ");
                            String newPhone = scanner.nextLine();
                            try {
                                employeeManager.getEmployee(id).setPhone(newPhone);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        System.out.println("Edit email? (y/n)");
                        String choice5 = scanner.nextLine();
                        if (choice5.equals("y")) {
                            System.out.print("Enter email: ");
                            String newEmail = scanner.nextLine();
                            try {
                                employeeManager.getEmployee(id).setEmail(newEmail);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        System.out.println("Edit employee type? (y/n)");
                        String choice6 = scanner.nextLine();
                        if (choice6.equals("y")) {
                            System.out.println("1. Fresher");
                            System.out.println("2. Experience");
                            System.out.println("3. Intern");
                            System.out.print("Enter your choice: ");
                            int choice7 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice7) {
                                case 1:
                                    System.out.print("Enter graduation rank: ");
                                    String graduationRank = scanner.nextLine();
                                    System.out.print("Enter education: ");
                                    String education = scanner.nextLine();
                                    try {
                                        Employee newEmployee = new Fresher(employeeManager.getEmployee(id), graduationRank, education);
                                        employeeManager.editEmployee(id, newEmployee);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 2:
                                    System.out.print("Enter exp in year: ");
                                    int expInYear = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Enter pro skill: ");
                                    String proSkill = scanner.nextLine();
                                    try {
                                        Employee newEmployee = new Experience(employeeManager.getEmployee(id), expInYear, proSkill);
                                        employeeManager.editEmployee(id, newEmployee);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 3:
                                    System.out.print("Enter major: ");
                                    String major = scanner.nextLine();
                                    System.out.print("Enter semester: ");
                                    String semester = scanner.nextLine();
                                    System.out.print("Enter university name: ");
                                    String universityName = scanner.nextLine();
                                    try {
                                        Employee newEmployee = new Intern(employeeManager.getEmployee(id), major, semester, universityName);
                                        employeeManager.editEmployee(id, newEmployee);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    String id1 = scanner.nextLine();
                    if (employeeManager.getEmployee(id1) != null) {
                        employeeManager.deleteEmployee(id1);
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 4:
                    System.out.println("1. Fresher");
                    System.out.println("2. Experience");
                    System.out.println("3. Intern");
                    System.out.print("Enter your choice: ");
                    int choice8 = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice8) {
                        case 1:
                            System.out.print(employeeManager.searchEmployeeByType(EmployeeType.FRESHER));
                            break;
                        case 2:
                            System.out.print(employeeManager.searchEmployeeByType(EmployeeType.EXPERIENCED));
                            break;
                        case 3:
                            System.out.print(employeeManager.searchEmployeeByType(EmployeeType.INTERN));
                            break;
                    }
                    break;
                case 5:
                    System.out.print("Enter certificate id: ");
                    String certificateId = scanner.nextLine();
                    System.out.print("Enter certificate name: ");
                    String certificateName = scanner.nextLine();
                    System.out.print("Enter certificate rank: ");
                    String certificateRank = scanner.nextLine();
                    System.out.print("Enter certificate date: ");
                    String certificateDate = scanner.nextLine();
                    System.out.print("Enter certificate place: ");
                    String certificatePlace = scanner.nextLine();
                    System.out.println("Enter employee id: ");
                    String employeeId = scanner.nextLine();
                    if (employeeManager.getEmployee(employeeId) != null) {
                        Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
                        employeeManager.getEmployee(employeeId).addCertificate(certificate);
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 6:
                    isRunning = false;
                    break;
            }

        }
    }
}
