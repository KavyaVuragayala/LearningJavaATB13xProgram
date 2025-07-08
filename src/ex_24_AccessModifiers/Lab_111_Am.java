package ex_24_AccessModifiers;

public class Lab_111_Am {
}

class Father{

    private int gold = 1000;
    int car=1;
    public int bhk3= 1;

}

class Son extends Father{
    void canUse() {
        // System.out.println(gold);   gold--> Private
        System.out.println(car);      // car-> default
        System.out.println(bhk3);     // bhk3 --> public
    }

}
