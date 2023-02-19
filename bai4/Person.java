public class Person {
    String name;
    int age;
    String occupation;

    String id;

    public Person(String name, int age, String occupation, String id) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
