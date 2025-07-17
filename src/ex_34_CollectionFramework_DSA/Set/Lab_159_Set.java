package ex_34_CollectionFramework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_159_Set {
    public static void main(String[] args) {

        // Set doesn't allow duplicates

        Set hs = new HashSet();     // HashSet
        hs.add("Alice");
        hs.add("John");
        hs.add("Alice"); // doesn't give error but doesn't even store in set
        System.out.println(hs);
        Set lhs = new LinkedHashSet(); // LinkedHashSet

        Set ts = new TreeSet(); // TreeSet
    }
}
