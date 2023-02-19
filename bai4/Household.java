import java.util.List;

public class Household {

    String addressNumber;
    private List<Person> members;

    public Household(String addressNumber, List<Person> members) {
        this.addressNumber = addressNumber;
        this.members = members;
    }

    @Override
    public String toString() {
        return "Household{" +
                "addressNumber='" + addressNumber + '\'' +
                ", members=" + members +
                '}';
    }
}
