import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VehicleManager {
    Map<String, Vehicle> vehicles;
    public VehicleManager() {
        vehicles = new HashMap<>();
    }

    public boolean add(Vehicle vehicle) {
        if (vehicles.containsKey(vehicle.id)) {
            return false;
        }
        vehicles.put(vehicle.id, vehicle);
        return true;
    }

    public boolean remove(String id) {
        if (!vehicles.containsKey(id)) {
            return false;
        }
        vehicles.remove(id);
        return true;
    }

    public List<Vehicle> searchByManufacturer(String manufacturer) {
        return vehicles.values().stream().filter(vehicle -> vehicle.manufacturer.equals(manufacturer)).toList();
    }

    public List<Vehicle> searchByColor(String color) {
        return vehicles.values().stream().filter(vehicle -> vehicle.color.equals(color)).toList();
    }


    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1. Add vehicle");
            System.out.println("2. Remove vehicle");
            System.out.println("3. Search by manufacturer");
            System.out.println("4. Search by color");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle id: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter vehicle manufacturer: ");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter vehicle year of manufacture: ");
                    int yearOfManufacture = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter vehicle price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter vehicle color: ");
                    String color = scanner.nextLine();
                    System.out.println("Enter vehicle type: ");
                    String type = scanner.nextLine();
                    Vehicle vehicle = null;
                    switch (type) {
                        case "motorbike":
                            System.out.println("Enter engine capacity: ");
                            double engineCapacity = Double.parseDouble(scanner.nextLine());
                            vehicle = new Motorbike(id, manufacturer, yearOfManufacture, price, color, engineCapacity);
                            break;
                        case "truck":
                            System.out.println("Enter weight: ");
                            double weight = Double.parseDouble(scanner.nextLine());
                            vehicle = new Truck(id, manufacturer, yearOfManufacture, price, color, weight);
                            break;
                        default:
                            System.out.println("Invalid vehicle type");
                            break;
                    }
                    if (vehicle != null) {
                        if (vehicleManager.add(vehicle)) {
                            System.out.println("Add vehicle successfully");
                        } else {
                            System.out.println("Add vehicle failed");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter vehicle id: ");
                    id = scanner.nextLine();
                    if (vehicleManager.remove(id)) {
                        System.out.println("Remove vehicle successfully");
                    } else {
                        System.out.println("Remove vehicle failed");
                    }
                    break;
                case 3:
                    System.out.println("Enter manufacturer: ");
                    manufacturer = scanner.nextLine();
                    List<Vehicle> vehicles = vehicleManager.searchByManufacturer(manufacturer);
                    for (Vehicle v : vehicles) {
                        System.out.println(v);
                    }
                    break;
                case 4:
                    System.out.println("Enter color: ");
                    color = scanner.nextLine();
                    vehicles = vehicleManager.searchByColor(color);
                    for (Vehicle v : vehicles) {
                        System.out.println(v);
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
