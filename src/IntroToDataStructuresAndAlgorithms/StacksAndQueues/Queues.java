package IntroToDataStructuresAndAlgorithms.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();//FIFO first in first out rule

        q.add(4);
        q.add(7);
        q.add(51);
        System.out.println(q);//So our first added value is 4 because of that our head is 4 too(FIFO)
        q.remove();//We removed 4
        System.out.println(q);
        System.out.println(q.peek());//Now the head of the queue is 7
    }
}
