package ex_34_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_165_HashMap {
    public static void main(String[] args) {

        Map<String,Integer> m1 = new HashMap();
        m1.put("i10",1);
        m1.put("MG Astor",1);
        m1.put("Creta",2);
        m1.put("Creta",10); // will override the latest value

        //m1.put(18,19); allowed when no datatype is declared

        System.out.println(m1.size());   // will gives according to key pairss

        //iterate
        for(String key : m1.keySet()){
            System.out.println(key);//keySet will return keys
            System.out.println(m1.get(key));
        }

        // if key exsits or not
        if(m1.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }

    }
}
