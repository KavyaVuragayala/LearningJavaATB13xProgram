package ex_28_InstanceInitializationBlock_IIB;

public class Lab_118_IIB {
    public static void main(String[] args) {

        // when a instance is created IIB will be called no.of objects increase then IIB will be executing those many times
        //if there is a static block then SIB will be executing first then IIB
        // no.of objects increase then SIB will not be execute only 1 time
        A a = new A();
        A a1 = new A();
    }
}

class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("This is IIB");
        System.out.println("++++++++++");
        //mysql connection
        //read csv,xlsv
    }
    {
        System.out.println("This is another IIB");
    }
    {
        System.out.println("Multiple IIB is allowed");
    }

    static{
        System.out.println("this is a static block ");
    }
}
