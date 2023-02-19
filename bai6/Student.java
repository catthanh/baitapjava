public class Student {
    String name;
    int age;
    String placeOfBirth;

    String className;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String name, int age, String placeOfBirth, String className) {
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
        this.className = className;
    }
}
