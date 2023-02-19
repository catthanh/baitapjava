import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;

    String id;

    List<Room> rentedRooms;

    public Person(String name, int age,  String id, List<Room> rentedRooms) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.rentedRooms = rentedRooms;
    }
}
