package Entity;

import Helper.Validator;

import Exception.*;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String id;
    String name;
    String birthday;
    String phone;
    String email;

    List<Certificate> certificates;

    EmployeeType employeeType;
    static int employeeCount = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FullNameException {
        if (Validator.validateName(name)) {
            this.name = name;
        } else {
            throw new FullNameException();
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) throws BirthdayException {
        if (Validator.validateBirthday(birthday)) {
            this.birthday = birthday;
        } else {
            throw new BirthdayException();
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws PhoneException {
        if (Validator.validatePhone(phone)) {
            this.phone = phone;
        } else {
            throw new PhoneException();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (Validator.validateEmail(email)) {
            this.email = email;
        } else {
            throw new EmailException();
        }
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public Employee(String name, String birthday, String phone, String email, EmployeeType employeeType) throws BirthdayException, PhoneException, EmailException, FullNameException {
        if (!Validator.validateName(name)) throw new FullNameException();
        if (!Validator.validateBirthday(birthday)) throw new BirthdayException();
        if (!Validator.validatePhone(phone)) throw new PhoneException();
        if (!Validator.validateEmail(email)) throw new EmailException();

        this.id = ++employeeCount + "";
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        certificates = new ArrayList<>();
        employeeCount++;
    }

    public void showMe() {
        System.out.println("Entity.Employee information: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Entity.Employee type: " + employeeType);
    }

    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                ", employeeType=" + employeeType +
                '}';
    }
}
