import Entity.Falcuty;
import Entity.Student;

import java.util.Comparator;
import java.util.List;

public class UniversityManager {

    List<Falcuty> falcuties;

    public UniversityManager(List<Falcuty> falcuties) {
        this.falcuties = falcuties;
    }

    public boolean checkIfStudentIsFormal(Student student) {
        return student instanceof Entity.FormalStudent;
    }

    public double getSemeterResult(Student student, int semester) {
        return student.getResults().stream().filter(result -> result.getSemester() == semester).findFirst().get().getScore();
    }

    public int countTotalStudentInFalcuty(Falcuty falcuty) {
       return (int) falcuty.getStudents().stream().count();
    }

    public Student highestAdmissionPointByFalcuty(Falcuty falcuty) {
        return falcuty.getStudents().stream().max(Comparator.comparingDouble(Student::getAdmissionScore)).get();
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}