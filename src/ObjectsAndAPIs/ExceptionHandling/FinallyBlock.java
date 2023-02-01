package ObjectsAndAPIs.ExceptionHandling;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        File file =  new File("Desktop/nonexistent.txt");
        Scanner fileRead = null;
        try{
            fileRead = new Scanner(file);
            while (fileRead.hasNext()){
                System.out.println(fileRead.nextDouble());
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally {
            fileRead.close();
            //This code executed no matter what happens in the try catch block
        }
    }
}
