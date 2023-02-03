package ObjectsAndAPIs.ExceptionHandling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class TryAndCatchBlocks {
    public static void main(String[] args) {
        File file = new File("Desktop/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Sorry, an error has occurred : "+ e.getMessage());
            e.printStackTrace();
        }
        //Exceptions also have stack traces
        //Stack trace is an log of method calls that led to a thrown exception

        //Checked and Unchecked Exeptions
        //Checked Exceptions
        //Exceptions that are verified by the compiler
        //Unchecked Eceptions
        //Exceptions that are not verified by the compiler


    }
}
