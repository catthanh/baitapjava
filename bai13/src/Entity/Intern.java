package Entity;

import Exception.*;

public class Intern extends Employee {
    private String major;
    private String semester;
    private String universityName;

    public Intern(String name, String birthday, String phone, String email, String major, String semester, String universityName) throws BirthdayException, PhoneException, FullNameException, EmailException {
        super(name, birthday, phone, email, EmployeeType.INTERN);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(Employee employee, String major, String semester, String universityName) throws BirthdayException, PhoneException, FullNameException, EmailException {
        super(employee.getName(), employee.getBirthday(), employee.getPhone(), employee.getEmail(), EmployeeType.INTERN);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("University name: " + universityName);
    }

    @Override
    public String toString() {
        return "Intern{" +
                "major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
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
