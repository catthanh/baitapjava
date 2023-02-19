public class Person {
    String id;
    String name;
    int age;
    String placeOfBirth;

    public Person(String id, String name, int age, String placeOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
