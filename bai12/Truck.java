public class Truck extends Vehicle {
    double weight;

    public Truck(String id, String manufacturer, int yearOfManufacture, double price, String color, double weight) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.weight = weight;
    }
}
