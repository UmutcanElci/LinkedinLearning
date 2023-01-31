package ObjectsAndAPIs.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Bananna");
        fruits.add("Lemon");
        fruits.add("Apple");//The duplicate element not be stored
        //Set is a unordered collection
        System.out.println(fruits.contains("Lemon"));
        fruits.remove("Lemon");

        Set moreFruit = Set.of("pear","raisin","cherry");//Setting collection in this way is simple but
        System.out.println(moreFruit);//you can't change add or remove something Immutable object
    }
}
