public class Staff extends  Person {
    double hardSalary;
    double bonus;
    double penalty;

    public Staff(String id, String name, int age, String placeOfBirth, double hardSalary, double bonus, double penalty) {
        super(id, name, age, placeOfBirth);
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public double getTotalSalary() {
        return hardSalary + bonus - penalty;
    }


}
