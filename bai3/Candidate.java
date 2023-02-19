public class Candidate {
    String id;
    String name;
    String address;

    int priorityLevel;

    Group group;

    public Candidate(String id, String name, String address, int priorityLevel, Group group) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.group = group;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
