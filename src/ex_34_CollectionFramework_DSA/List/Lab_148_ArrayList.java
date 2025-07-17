package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_148_ArrayList {
    public static void main(String[] args) {

        List arrayList = new ArrayList();    // dynamic dispatch
        arrayList.add("1");
        arrayList.add(123);
        arrayList.add(false);
        arrayList.add(null);
        arrayList.add("alice");
        arrayList.add(966.973);
        arrayList.add("alice");     // allows duplicates
        System.out.println(arrayList);
        System.out.println(arrayList.size());


        ArrayList al = new ArrayList();
        al.add(1);
        al.add("john");
        System.out.println(al.isEmpty());

        ArrayList l = new ArrayList();
        System.out.println(l.isEmpty());

    }
}
