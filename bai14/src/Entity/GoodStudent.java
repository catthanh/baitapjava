package Entity;

import Exception.*;

public class GoodStudent extends Student {
    double gpa;
    String bestRewardName;


    public GoodStudent(String fullName, String dateOfBirth, String sex, String phone, String universityName, String gradeLevel, double gpa, String bestRewardName) throws InvalidPhoneNumberException, InvalidFullNameException, InvalidDOBException {
        super(fullName, dateOfBirth, sex, phone, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public void showMyInfo() {
        super.showMyInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Best reward name: " + bestRewardName);
    }
}
