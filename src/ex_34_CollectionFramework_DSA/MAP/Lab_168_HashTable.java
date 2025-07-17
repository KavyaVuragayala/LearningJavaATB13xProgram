package ex_34_CollectionFramework_DSA.MAP;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_168_HashTable {
    public static <HashTable> void main(String[] args) {

        // map -> K ,V , null values are allowed
        //Hashtable - Synchronised , slow and legacy class-- thread Safe
        // T1, T2 -- they will use one by one

        Hashtable<Integer, String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3,"three");
      //  ht1.put(4,null);   // hashtable will not allow null values   gives java.lang.NullPointerException
        //  ht1.put(null,8);
        //  ht1.put(null,null);
        System.out.println(ht1);

        Enumeration enumeration = ht1.keys();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
