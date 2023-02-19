import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Group {
    String name;
    List<Subject> subjects;

    private Group(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public static Group A() {
        return new Group("A", List.of(Subject.Math(), Subject.Physics(), Subject.Chemistry()));
    }

    public static Group B() {
        return new Group("B", List.of(Subject.Math(), Subject.Chemistry(), Subject.Biology()));
    }

    public static Group C() {
        return new Group("C", List.of(Subject.Literature(), Subject.History(), Subject.Geography()));
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
