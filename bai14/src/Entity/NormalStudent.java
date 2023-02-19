package Entity;

import Exception.*;

public class NormalStudent extends Student {
    double englishScore;
    double entryTestScore;

    public NormalStudent(String fullName, String dateOfBirth, String sex, String phone, String universityName, String gradeLevel, double englishScore, double entryTestScore) throws InvalidPhoneNumberException, InvalidFullNameException, InvalidDOBException {
        super(fullName, dateOfBirth, sex, phone, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public void showMyInfo() {
        System.out.println("English score: " + englishScore);
        System.out.println("Entry test score: " + entryTestScore);
    }
}
