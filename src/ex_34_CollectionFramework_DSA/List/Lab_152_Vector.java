package ex_34_CollectionFramework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab_152_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("hi");
        v.add(1);
        v.add(null);
        v.add(true);
        v.add("hi");
        v.add("hi");
        v.add("hello");
        System.out.println(v);
        System.out.println(v.contains("hi"));
        v.remove(1);

        System.out.println("---------- for each");
        for(Object o: v){
            System.out.println(o);
        }

        System.out.println("---------- iterator");
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // concept of enumeration is not used in WEbAutomation
        System.out.println("------------ enumeration");
        Enumeration<Object> enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
