package ex_34_CollectionFramework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;

public class Lab_153_ListIterator_Vector {
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


        // ListIterator has both next and previous functions
        // Iterator has only next function
        ListIterator listIterator = v.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.next());
        }


    }
}
