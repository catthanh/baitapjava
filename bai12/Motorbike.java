public class Motorbike extends Vehicle {
    double engineCapacity;

    public Motorbike(String id, String manufacturer, int yearOfManufacture, double price, String color, double engineCapacity) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.engineCapacity = engineCapacity;
    }
}
