package ex_34_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_164_Map {
    public static void main(String[] args) {

        // Map m1= new Map();   cannot be created as obj of an inteface is not created
        Map hm = new HashMap();
        // map stores key value pair
        //order is not maintained
        hm.put("name","Alice");
        hm.put("rollno",1);
        hm.put("phonenumber",987643578);
        System.out.println(hm);
        System.out.println("--------------");


        // LinkedHashMap order is maintained
        Map lhm = new LinkedHashMap();
        lhm.put("name","John");
        lhm.put("rollno",2);
        lhm.put("phonenumber",987643578);
        System.out.println(lhm);
        System.out.println("--------------");

        // TreeMap will be doing natural sorting
        Map tm = new TreeMap();
        tm.put("firstname","John");
        tm.put("lastname","John");
        tm.put("rollno",2);
        tm.put("phonenumber",987643578);
        System.out.println(tm);


    }

}
