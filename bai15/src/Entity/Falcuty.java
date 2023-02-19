package Entity;

import java.util.ArrayList;
import java.util.List;

public class Falcuty {
    String name;
    List<Student> students;

    public Falcuty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student highestAdmissionPoint() {
        return students.stream().max((s1, s2) -> Double.compare(s1.getAdmissionScore(), s2.getAdmissionScore())).get();
    }

    public List<Student> getInServiceStudentsByLocations(String location) {
        return students.stream().filter(student -> student instanceof InServiceStudent && ((InServiceStudent) student).getLocation().equals(location)).toList();
    }

    public List<Student> getHighestScoreStudentsByRecentSemeter() {
        return students.stream().filter(student -> student.getResults().get(-1).getScore()>8.0).toList();
    }



}
