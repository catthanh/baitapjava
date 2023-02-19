package Entity;

public class InServiceStudent extends Student {
    String location;

    public InServiceStudent(String id, String dob, int yearAdmission, double admissionScore, String location) {
        super(id, dob, yearAdmission, admissionScore);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
