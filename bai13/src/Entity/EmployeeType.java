package Entity;

public enum EmployeeType {
    EXPERIENCED, FRESHER, INTERN;

    public static EmployeeType getEmployeeType(String type) {
        switch (type) {
            case "EXPERIENCED":
                return EXPERIENCED;
            case "FRESHER":
                return FRESHER;
            case "INTERN":
                return INTERN;
            default:
                return null;
        }
    }
}
