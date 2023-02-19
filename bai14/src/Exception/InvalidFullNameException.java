package Exception;

public class InvalidFullNameException extends Exception{
    public InvalidFullNameException(){
        super("Full name is invalid");
    }
}
