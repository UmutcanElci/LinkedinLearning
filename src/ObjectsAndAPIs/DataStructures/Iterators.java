package ObjectsAndAPIs.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");//Set are unordered collection
        //So there's no method of the set that allow us to get certain item by index
        //but we can loop through the Set with an iterator
        var i = fruits.iterator();
        while (i.hasNext()){
            //has next method return true if there's more item
            System.out.println(i.next());//Gives us next element if has next method gives false the while loop is done
        }
    }
}
