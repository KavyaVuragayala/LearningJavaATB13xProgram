package ex_34_CollectionFramework_DSA.List;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Lab_147_ArrayList {
    public static void main(String[] args) {

        //declaartion of ArrayList

        List arrayList = new ArrayList();    // dynamic dispatch
        // ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add(123);
        arrayList.add(false);
        arrayList.add(null);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        // default size of ArrayList is 10
        // different datatypes are allowed


    }
}
