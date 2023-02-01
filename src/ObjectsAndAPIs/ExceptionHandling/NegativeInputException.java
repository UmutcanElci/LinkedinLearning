package ObjectsAndAPIs.ExceptionHandling;

public class NegativeInputException extends Exception {
    public NegativeInputException(){
        this("Input must be greater that or equal to 0");
    }
    public NegativeInputException(String message){
        super(message);
    }
}
