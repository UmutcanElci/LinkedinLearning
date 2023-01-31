package ObjectsAndAPIs.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Streams {
    //A stream represent a sequence of elements from a collection, array or other input source
    public static void main(String[] args) {
        /*
        int[] n = {1,2,3,4,5,6};
        Arrays.stream(n)
                .forEach(i -> System.out.println(i  + " "));

         */

        //Intermediate : Perform the operation and return the resulting stream
        //Terminal : Return a result and close the stream
        List<String> veggies = List.of(
                "Spinach",
                "Cabbage",
                "peas",
                "Green beans",
                "Brussels sprouts",
                "Corrats"
        );
        veggies.stream().anyMatch(v -> v.contains("s"));//AnyMatch operation looks through the stream to determine if any of the elements match a given condition
        veggies.stream().filter(v -> v.startsWith("C"))
                .forEach(System.out::println);
        veggies.stream().map(String::toUpperCase)
                .forEach(System.out::println);
        veggies.stream().sorted()
                .forEach(System.out::println);
    }


}
