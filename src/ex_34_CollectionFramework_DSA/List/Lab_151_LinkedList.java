package ex_34_CollectionFramework_DSA.List;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab_151_LinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        // arraylist stores in continous manner
        //linkedlist stores the elements in scattered manner

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(true);
        list.add("alice");
        list.add(123);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("alice"));
        System.out.println(list.get(4));

        System.out.println("------------");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
