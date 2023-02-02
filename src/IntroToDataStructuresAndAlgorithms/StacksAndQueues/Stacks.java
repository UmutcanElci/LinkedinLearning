package IntroToDataStructuresAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack s1 = new Stack();//LIFO Last in First out
        s1.push(4);
        s1.push(8);
        s1.push(12);
        s1.push("Has");//To add we use push
        s1.push("A");
        System.out.println(s1);
        s1.pop();//To remove a element we use remove but because of the stack it's remove th last added element
        System.out.println(s1);
        System.out.println(s1.peek());//Peek gives us the head of the element that means the last added element

    }
}
