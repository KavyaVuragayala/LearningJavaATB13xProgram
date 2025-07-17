package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_149_ArrayList {
    public static void main(String[] args) {

        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(true);
        list.add("6");
        list.add(5);
        list.add("3");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("1"));

        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);

        System.out.println("------------------------");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------");
        for(Object o:list){
            System.out.println(o);
        }

        list.set(1,23);
        System.out.println(list);

        list.remove(2);    // remove at index
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
