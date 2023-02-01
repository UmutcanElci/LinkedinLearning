package ObjectsAndAPIs.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        //Declaration of resources that should bbe automatically closed after the execution of a try block
        File inputFile = new File("Desktop/nonexistent1.txt");
        File outputFile = new File("Desktop/nonexistent2.txt");

        try(Scanner fileReader = new Scanner(inputFile);
            PrintWriter fileWriter = new PrintWriter(outputFile)){
            while (fileReader.hasNext()){
                fileWriter.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }
}
