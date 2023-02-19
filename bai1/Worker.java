public class Worker extends Employee {
    private int level;

    public Worker(String name, int age, Gender gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
