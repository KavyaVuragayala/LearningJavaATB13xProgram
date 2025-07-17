package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_156_IQ {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection is an interface
        // Collections is a class ( it contains complete methods which list, set , queue )

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
