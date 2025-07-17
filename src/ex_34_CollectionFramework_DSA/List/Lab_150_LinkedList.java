package ex_34_CollectionFramework_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class Lab_150_LinkedList {
    public static void main(String[] args) {

         List list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.addLast("Alice");
        list.addFirst("John");

        System.out.println(list.size());
        System.out.println(list);
        list.removeFirst();

        System.out.println(list);


    }
}
