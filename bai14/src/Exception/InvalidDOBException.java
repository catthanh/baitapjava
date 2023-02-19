package Exception;

public class InvalidDOBException extends Exception{
    public InvalidDOBException(){
        super("Date of birth is invalid");
    }
}
