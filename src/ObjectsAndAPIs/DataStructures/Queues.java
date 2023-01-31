package ObjectsAndAPIs.DataStructures;

import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args) {//Most common implementations of queue is Linked list and priority queue
        Queue fruits = new LinkedList();
        fruits.add("Apple");//When we remove apple Lemon becomes the head
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        //Queues are ordered collection
        //And allow duplicates
        fruits.add("Lemon");
        //Typically follow first in first out
        fruits.remove();//That's mean if we remove something we don't need to specify which object to remove
        //It will remove the first one on the list
        //If we want to know which one is the head we use
        fruits.peek();
        //This give the head element of the queue


    }
}
