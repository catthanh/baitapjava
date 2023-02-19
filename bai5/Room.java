import java.time.LocalDate;

public class Room {
    int number;
    RoomClass roomClass;
    double price;

    LocalDate startDate;

    enum RoomClass {
        A,
        B,
        C
    }

    Room(int number, RoomClass roomClass) {
        this.number = number;
        this.roomClass = roomClass;
        switch (roomClass) {
            case A -> this.price = 500d;
            case B -> this.price = 300d;
            case C -> this.price = 100d;
        }
        startDate = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomClass getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(RoomClass roomClass) {
        this.roomClass = roomClass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void rent(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isAvailable() {
        return startDate == null;
    }

}
