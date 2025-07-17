package ex_34_CollectionFramework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab_161_Queue {
    public static void main(String[] args) {

        // 0.00001% used in automation
        PriorityQueue p = new PriorityQueue();
        p.add("Alice");
        p.add("John");
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);

        /*
        peek() To retrieve (inspect) the head (front) of the queue without removing it.
        poll() To retrieve and remove the head (front) of the queue.
        */
    }
}
