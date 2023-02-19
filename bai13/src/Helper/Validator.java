package Helper;

public class Validator {
    public static boolean validateBirthday(String birthday) {
        String[] date = birthday.split("/");
        if(date.length != 3) {
            return false;
        }
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        if(day < 1 || day > 31) {
            return false;
        }
        if(month < 1 || month > 12) {
            return false;
        }
        if(year < 1900 || year > 2020) {
            return false;
        }
        return true;
    }

    public static boolean validatePhone(String phone) {
        if(phone.length() != 10) {
            return false;
        }
        for(int i = 0; i < phone.length(); i++) {
            if(phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        if(!email.contains("@")) {
            return false;
        }
        if(!email.contains(".")) {
            return false;
        }
        if(email.indexOf("@") > email.indexOf(".")) {
            return false;
        }
        return true;
    }

    public static boolean validateName(String name) {
        if(name.length() < 6) {
            return false;
        }
        return true;
    }
}
