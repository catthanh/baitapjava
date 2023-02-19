import java.util.*;

public class BillManager {
    List<Customer> customerList;
    Map<Customer,Bill> customerBillMap;

    public BillManager() {
        this.customerList = new ArrayList<>();
        this.customerBillMap = new HashMap<>();
    }

    public boolean addCustomer(Customer customer) {
        if (customerList.contains(customer)) {
            return false;
        }
        customerList.add(customer);
        return true;
    }

    public boolean addBill(Bill bill) {
        if (customerBillMap.containsKey(bill.getCustomer())) {
            return false;
        }
        customerBillMap.put(bill.getCustomer(), bill);
        return true;
    }

    public void printBill() {
        for (Customer customer : customerList) {
            Bill bill = customerBillMap.get(customer);
            System.out.println(bill);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bill Manager");
        BillManager billManager = new BillManager();
        Scanner scanner = new Scanner(System.in);
        boolean runnning = true;
        while (runnning) {
            System.out.println("1. Add customer");
            System.out.println("2. Add bill");
            System.out.println("3. Print bill");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter customer address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter customer id: ");
                    String id = scanner.nextLine();
                    Customer customer = new Customer(name, address, id);
                    if (billManager.addCustomer(customer)) {
                        System.out.println("Add customer successfully");
                    } else {
                        System.out.println("Add customer failed");
                    }
                    break;
                case 2:
                    System.out.println("Enter customer id: ");
                    String id1 = scanner.nextLine();
                    Customer customer1 = null;
                    for (Customer customer2 : billManager.customerList) {
                        if (customer2.getId().equals(id1)) {
                            customer1 = customer2;
                            break;
                        }
                    }
                    if (customer1 == null) {
                        System.out.println("Customer not found");
                    } else {
                        System.out.println("Enter previous number: ");
                        double previousNumber = Double.parseDouble(scanner.nextLine());
                        System.out.println("Enter current number: ");
                        double currentNumber = Double.parseDouble(scanner.nextLine());
                        Bill bill = new Bill(customer1, previousNumber, currentNumber);
                        if (billManager.addBill(bill)) {
                            System.out.println("Add bill successfully");
                        } else {
                            System.out.println("Add bill failed");
                        }
                    }
                    break;
                case 3:
                    billManager.printBill();
                    break;
                case 4:
                    runnning = false;
                    break;
            }
        }
    }
}
