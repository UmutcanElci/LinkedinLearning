package ObjectsAndAPIs.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdas {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.forEach(f -> System.out.println(f));//Lambda Expression are block of code that accepts parameters and returns a value
        //Or we can use
        fruits.forEach(System.out::println);//This reads as call this method and pass in the current element we are on
        fruits.forEach(f -> {
            f = "fruits " + f;
            System.out.println(f);
        });
    }
    public  static void printMap_forEach(){

    }
}
