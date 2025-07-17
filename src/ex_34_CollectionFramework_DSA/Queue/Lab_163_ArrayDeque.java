package ex_34_CollectionFramework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_163_ArrayDeque {
    public static void main(String[] args) {

        Deque d = new ArrayDeque();
        d.add(8);
        d.add("Alice");

        System.out.println(d);
    }
}
