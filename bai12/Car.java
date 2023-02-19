public class Car extends Vehicle {
    int numberOfSeats;
    String typeOfEngine;

    public Car(String id, String manufacturer, int yearOfManufacture, double price, String color, int numberOfSeats, String typeOfEngine) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.numberOfSeats = numberOfSeats;
        this.typeOfEngine = typeOfEngine;
    }
}
