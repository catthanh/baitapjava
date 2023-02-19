import Entity.GoodStudent;
import Entity.NormalStudent;
import Entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manager {
    List<Student> candidates;

    public Manager() {
        this.candidates = new ArrayList<Student>();
    }

    public void showCandidates() {
        candidates.stream().sorted((o1, o2) -> o1.getFullName().compareTo(o2.getFullName()) == 0 ?
                o1.getPhone().compareTo(o2.getPhone()) : o1.getFullName().compareTo(o2.getFullName())).forEach(Student::showMyInfo);
    }

    public boolean addCandidate(Student student) {
        return  candidates.add(student);
    }

    public void recruit(int quantity) {
        candidates.stream().sorted((o1, o2) -> {
            if (o1 instanceof GoodStudent && o2 instanceof GoodStudent) {
                GoodStudent goodStudent1 = (GoodStudent) o1;
                GoodStudent goodStudent2 = (GoodStudent) o2;
                return goodStudent1.getGpa() > goodStudent2.getGpa() ? -1
                        : goodStudent1.getGpa() == goodStudent2.getGpa() ?
                        goodStudent1.getFullName().compareTo(goodStudent2.getFullName()) : 1;
            } else if (o1 instanceof GoodStudent) {
                return -1;
            } else if (o2 instanceof GoodStudent) {
                return 1;
            } else {
                NormalStudent normalStudent1 = (NormalStudent) o1;
                NormalStudent normalStudent2 = (NormalStudent) o2;
                return normalStudent1.getEnglishScore() > normalStudent2.getEnglishScore() ? -1 : 1;
            }
        }).limit(quantity).forEach(student -> {
            student.showMyInfo();
        });
    }


    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1. Add a student");
            System.out.println("2. Show all students");
            System.out.println("3. Recruitment");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Date of birth: ");
                    String dateOfBirth = scanner.nextLine();
                    System.out.print("Sex: (1 for Male,2 for Female)");
                    int sexChoice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("University name: ");
                    String universityName = scanner.nextLine();
                    System.out.print("Grade level: (1 for Good, 2 for Normal)");
                    String gradeLevel = scanner.nextLine();
                    switch (gradeLevel) {
                        case "1": {
                            System.out.print("GPA: ");
                            double gpa = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Best Reward: ");
                            String bestRewardName = scanner.nextLine();
                            try {
                                manager.addCandidate(new GoodStudent(fullName,dateOfBirth,sexChoice==1?"Male":"Female",phone,universityName,"Good",gpa,bestRewardName));
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }
                        case "2": {
                            System.out.print("English score: ");
                            double englishScore = scanner.nextDouble();
                            System.out.print("Math score: ");
                            double mathScore = scanner.nextDouble();
                            try {
                                manager.addCandidate(new NormalStudent(fullName,dateOfBirth,sexChoice==1?"Male":"Female",phone,universityName,"Normal",englishScore,mathScore));
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid choice");

                    }

                    break;
                case 2:
                    manager.showCandidates();
                    break;
                case 3:
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();
                    manager.recruit(quantity);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}