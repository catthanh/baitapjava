package Entity;

import Exception.*;
public class Fresher extends Employee {
    private String graduationRank;
    private String education;

    public Fresher(String name, String birthday, String phone, String email, String graduationRank, String education) throws BirthdayException, PhoneException, FullNameException, EmailException {
        super(name, birthday, phone, email, EmployeeType.FRESHER);
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(Employee employee, String graduationRank, String education) throws BirthdayException, PhoneException, FullNameException, EmailException {
        super(employee.getName(), employee.getBirthday(), employee.getPhone(), employee.getEmail(), EmployeeType.FRESHER);
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.println("Graduation rank: " + graduationRank);
        System.out.println("Education: " + education);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                ", employeeType=" + employeeType +
                '}';
    }
}
