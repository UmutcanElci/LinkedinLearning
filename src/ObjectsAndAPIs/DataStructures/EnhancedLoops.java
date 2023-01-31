package ObjectsAndAPIs.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class EnhancedLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();//We specify the List elements are String if we can't say that they consider as objects
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
