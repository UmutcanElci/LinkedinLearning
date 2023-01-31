package ObjectsAndAPIs.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {//Some implementations of lists are Array List, Link lists, Stack and Vector
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println(fruits);//List are ordered
        //That's mean we can access elements with position
        System.out.println(fruits.get(2));
        //We also change the elements
        fruits.set(2,"grape");
        fruits.add("Lemon");
        System.out.println(fruits.indexOf("Lemon"));
        System.out.println(fruits.lastIndexOf("lemon"));
        //There's two ways to remove element one is with index and the other with object
        //If you use the object remove if there's duplicated values all the will be removed
    }
}
