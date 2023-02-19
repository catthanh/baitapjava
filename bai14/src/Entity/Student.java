package Entity;

import Helper.Validator;
import Exception.*;

public class Student {
    String fullName;
    String dateOfBirth;
    String sex;
    String phone;

    String universityName;

    String gradeLevel;

    public Student(String fullName, String dateOfBirth, String sex, String phone, String universityName, String gradeLevel) throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        if (!Validator.validateDOB(dateOfBirth)) throw new InvalidDOBException();
        if (!Validator.validateFullName(fullName)) throw new InvalidFullNameException();
        if (!Validator.validatePhone(phone)) throw new InvalidPhoneNumberException();
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phone = phone;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void showMyInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Sex: " + sex);
        System.out.println("Phone: " + phone);
        System.out.println("University name: " + universityName);
        System.out.println("Grade level: " + gradeLevel);
    }
}
