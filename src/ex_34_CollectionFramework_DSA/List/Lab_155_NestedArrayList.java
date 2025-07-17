package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_155_NestedArrayList {
    public static void main(String[] args) {

        List l1 = new ArrayList();
        l1.add("Onion");
        l1.add("Tomato");
        l1.add("Brinjal");

        List l2 = new ArrayList();
        l2.add("Pineapple");
        l2.add("Apple");
        l2.add("Banana");

        List l3 = new ArrayList();
        l3.add("Spinach");
        l3.add("Beetle Leaf");

        List l4 = new ArrayList();
        l4.add(l1);
        l4.add(l2);
        l4.add(l3);

        System.out.println(l4);
        System.out.println(l4.get(1));



    }
}
