package Helper;

public class Validator {
    public static boolean validateFullName(String fullName) {

        return fullName.length()<=50 && fullName.length()>=10;
    }

    public static boolean validateDOB(String dob) {
        return dob.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean validatePhone(String phone) {
        return phone.startsWith("090") ||
                phone.startsWith("098") ||
                phone.startsWith("091") ||
                phone.startsWith("031") ||
                phone.startsWith("035") ||
                phone.startsWith("038");
    }
}
