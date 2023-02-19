import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int age, String placeOfBirth, String className) {
        students.add(new Student(name, age, placeOfBirth, className));
    }

    public void removeStudent(String name) {
        students.removeIf(s -> s.name.equals(name));
    }

    List<Student> getStudentsWithAgeGreaterThan(int age) {
        return students.stream().filter(s -> s.age > age).toList();
    }

    List<Student> getStudentsWithAgeAndPlaceOfBirth(int age, String placeOfBirth) {
        return students.stream().filter(s -> s.age == age && s.placeOfBirth.equals(placeOfBirth)).toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        boolean running = true;
        while (running) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Get students with age greater than");
            System.out.println("4. Get students with age and place of birth");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student place of birth: ");
                    String placeOfBirth = scanner.nextLine();
                    System.out.print("Enter student class: ");
                    String className = scanner.nextLine();
                    school.addStudent(name, age, placeOfBirth, className);
                }
                case 2 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    school.removeStudent(name);
                }
                case 3 -> {
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    school.getStudentsWithAgeGreaterThan(age).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter place of birth: ");
                    String placeOfBirth = scanner.nextLine();
                    school.getStudentsWithAgeAndPlaceOfBirth(age, placeOfBirth).forEach(System.out::println);
                }
                case 5 -> running = false;
            }
        }
    }
}
