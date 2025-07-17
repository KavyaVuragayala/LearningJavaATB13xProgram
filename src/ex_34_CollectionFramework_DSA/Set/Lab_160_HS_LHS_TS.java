package ex_34_CollectionFramework_DSA.Set;

import java.util.*;

public class Lab_160_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        // follows hashing mechanism
        // no duplicates allowed
        // no order
        hs.add(null);
        hs.add(null);   // prints only one null

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");


        System.out.println(hs);

        System.out.println("----------------------");
        for(Object o : hs){
            System.out.println(o);
        }

        System.out.println("----------------------");
        Iterator iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Set lhs = new LinkedHashSet();
        // follows LinkedList Mechanism
        // order is maintained
        // no dulpictaes
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        hs.add(null);

        System.out.println(lhs);

        System.out.println("----------------------");
        for(Object o1 : lhs){
            System.out.println(o1);
        }

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));


        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the elements
        // order is maintained , sorting is done internally
        // sorting with ASCII values is done

        ts.add("Apple");
        ts.add("dapple");
        ts.add("xyz");
        ts.add("Orange");
        ts.add("watermelon");
      //  ts.add(null);         cannot sort null
        // ts.add(1234);        cannot sort integers
        System.out.println(ts);
        System.out.println("------------");

        for(Object o3: ts){
            System.out.println(o3);
        }

    }
}
