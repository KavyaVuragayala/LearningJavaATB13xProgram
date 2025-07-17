package ex_34_CollectionFramework_DSA.List;

import java.util.List;
import java.util.Stack;

public class Lab_154_Stack {
    public static void main(String[] args) {

        Stack s= new Stack();
        //List stack1= new Stack();
        s.add("python");
        s.add("java");
        s.push("C");
        s.push("C#");
        System.out.println(s);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s);

    }
}
