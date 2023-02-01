package ObjectsAndAPIs.ExceptionHandling;

public class ThrowingExceptions {
    public static  double calculatePay(double hours , double payRate)throws NegativeInputException {
        if (hours>40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }
        if (hours<0 ||payRate<0){
            throw new NegativeInputException();
            //Because our method is throwing checked exception we must specify that in method signature
        }
        return hours*payRate;

    }
}
