package ObjectsAndAPIs.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {//Popular implementations of the Map interface are hasp mak TreeMap and LinkedHashMap
        Map fruitCalories = new HashMap();
        fruitCalories.put("Apple",95);
        fruitCalories.put("Lemon",20);
        fruitCalories.put("Banana",105);
        fruitCalories.put("Orange",45);
        //The map interfaces is unique keys to values
        //Map are unordered
        //We can access elements with keys
        System.out.println("banana : "+fruitCalories.get("banana"));

    }
}
