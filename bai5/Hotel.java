import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private List<Person> customers;
    private List<Room> rooms;

    public Hotel() {
        customers = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    boolean addRoom(Room r) {
        return rooms.add(r);
    }

    public List<Person> getCustomers() {
        return customers;
    }

    public void addCustomer(String id, String name, int age, List<Room> rentedRooms) {
        if(customers.stream().anyMatch(c -> c.id.equals(id)))
            throw new IllegalArgumentException("Customer with id " + id + " already exists");
        customers.add(new Person(name, age, id, rentedRooms));
    }

    public void removeCustomer(String id) {
        customers.removeIf(c -> c.id.equals(id));
    }

    public double calculateTotal(Person p, int days) {
        return p.rentedRooms.stream().mapToDouble(r -> r.price).sum()*days;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        boolean running = true;
        while (running) {
            System.out.println("1. Add room");
            System.out.println("2. Add customer");
            System.out.println("3. Remove customer");
            System.out.println("4. Calculate total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter room number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter room class (A, B, C): ");
                    String roomClass = scanner.nextLine();
                    Room.RoomClass roomClassEnum = Room.RoomClass.valueOf(roomClass);
                    hotel.addRoom(new Room(number, roomClassEnum));
                }
                case 2 -> {
                    System.out.print("Enter customer id: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter number of rented rooms: ");
                    int numberOfRentedRooms = scanner.nextInt();
                    scanner.nextLine();
                    List<Room> rentedRooms = new ArrayList<>();
                    for (int i = 0; i < numberOfRentedRooms; i++) {
                        System.out.print("Enter room number: ");
                        int roomNumber = scanner.nextInt();
                        scanner.nextLine();
                        Room room = hotel.getRooms().stream().filter(r -> r.number == roomNumber).findFirst().orElse(null);
                        if (room == null) {
                            System.out.println("Room not found");
                            continue;
                        }
                        if (room.startDate != null) {
                            System.out.println("Room is already rented");
                            continue;
                        }
                        rentedRooms.add(room);
                    }
                    hotel.addCustomer(id, name, age, rentedRooms);
                }
                case 3 -> {
                    System.out.print("Enter customer id: ");
                    String id = scanner.nextLine();
                    hotel.removeCustomer(id);
                }
                case 4 -> {
                    System.out.print("Enter customer id: ");
                    String id = scanner.nextLine();
                    Person p = hotel.getCustomers().stream().filter(c -> c.id.equals(id)).findFirst().orElse(null);
                    if (p == null) {
                        System.out.println("Customer not found");
                        continue;
                    }
                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Total: " + hotel.calculateTotal(p, days));
                }
                case 5 -> running = false;
            }
        }

    }

}
