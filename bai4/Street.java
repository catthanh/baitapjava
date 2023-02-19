import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Street {
    List<Household> households;

    Street() {
        households = new ArrayList<>();
    }

    public boolean add(Household h) {
        return this.households.add(h);
    }

    @Override
    public String toString() {
        return "Street{" +
                "households=" + households +
                '}';
    }

    public static void main(String[] args) {
        Street street = new Street();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {

            System.out.println("Enter address:");
            String address = scanner.nextLine();

            List<Person> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < number; j++) {
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter occupation");
                String occupation = scanner.nextLine();
                System.out.println("Enter id");
                String id = scanner.nextLine();
                persons.add(new Person(name,age, occupation, id));
            }

            street.add(new Household(address, persons));
        }
        System.out.println(street);
    }
}
