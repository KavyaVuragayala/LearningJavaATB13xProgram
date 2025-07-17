package ex_34_CollectionFramework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab_162_Queue_LinkedList {
    public static void main(String[] args) {

        Queue q = new LinkedList();
        q.add(6);
        q.add("Alice");

        System.out.println(q);

        Iterator iterator = q.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
