package ex_33_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_145_Generics_List {
    public static void main(String[] args) {

        List normalList = new ArrayList();
      //  List<T> normalList = new ArrayList<T>();
        normalList.add(10);
        normalList.add("alice");
        normalList.add(true);

        // only integer type will be added

        List<Integer> Integer = new ArrayList();
        Integer.add(10);
      //  Integer.add("alice");

        // List is a collection of framework --> collection of items --> 12,3,alice ,john etc ....

    }

}
