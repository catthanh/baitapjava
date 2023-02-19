package Entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String dob;

    int yearAdmission;

    double admissionScore;

    List<Result> results;



    public Student(String id, String dob, int yearAdmission, double admissionScore) {
        this.id = id;
        this.dob = dob;
        this.yearAdmission = yearAdmission;
        this.admissionScore = admissionScore;
        results = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getYearAdmission() {
        return yearAdmission;
    }

    public void setYearAdmission(int yearAdmission) {
        this.yearAdmission = yearAdmission;
    }

    public double getAdmissionScore() {
        return admissionScore;
    }

    public void setAdmissionScore(double admissionScore) {
        this.admissionScore = admissionScore;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
