public class Subject {
    String name;

    private Subject(String name) {
        this.name = name;
    }

    public static Subject Math() {
        Subject s = new Subject("Math");
        return s;
    }

    public static Subject Physics() {
        Subject s = new Subject("Physics");
        return s;
    }

    public static Subject Chemistry() {
        Subject s = new Subject("Chemistry");
        return s;
    }

    public static Subject Biology() {
        Subject s = new Subject("Biology");
        return s;
    }

    public static Subject Literature() {
        Subject s = new Subject("Literature");
        return s;
    }

    public static Subject History() {
        Subject s = new Subject("History");
        return s;
    }

    public static Subject Geography() {
        Subject s = new Subject("Geography");
        return s;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}
