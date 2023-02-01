package ObjectsAndAPIs.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MutipleExceptions {
    public static void main(String[] args) {
        //Ways to handle Multiple Exceptions
        //Polymorphism
        //Series of catch blocks
        //Multiple catch block
        File file = new File("Desktop/nonexistent.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
}
