package Entity;

import Exception.*;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(String name, String birthday, String phone, String email, int expInYear, String proSkill) throws BirthdayException, PhoneException, FullNameException, EmailException, BirthdayException, PhoneException, FullNameException, EmailException {
        super(name, birthday, phone, email, EmployeeType.EXPERIENCED);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(Employee employee, int expInYear, String proSkill) throws BirthdayException, PhoneException, FullNameException, EmailException, BirthdayException, PhoneException, FullNameException, EmailException {
        super(employee.getName(), employee.getBirthday(), employee.getPhone(), employee.getEmail(), EmployeeType.EXPERIENCED);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.println("Entity.Experience in year: " + expInYear);
        System.out.println("Professional skill: " + proSkill);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
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
