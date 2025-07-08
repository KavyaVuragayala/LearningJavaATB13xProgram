package ex_23_Encapsulation;

public class Lab_110_RealCase_Bank {
    public static void main(String[] args) {

        ICICI i = new ICICI("ALice",1000);
        // System.out.println(i.name);  --> name is private
        System.out.println(i.getName());
        System.out.println(i.getBal());
        int setBalance = i.setBal(500, true);
        System.out.println(i.getBal());

    }
}

class ICICI{
    private String name;
    private int bal;

    public ICICI(String name_user, int bal_user){

        this.name = name_user;
        this.bal = bal_user;

    }

    public String getName(){
        return name;
    }
    public String setName(){
        this.name= name;
        return "";
    }

    public int getBal(){
        return bal;
    }

    public int setBal(int bal,boolean cashier){
        if(cashier){
            System.out.println("Changed balance to");
            this.bal=bal;
        }
        else {
            System.out.println("You dont have access to edit the balance");
        }

        return bal;
    }



}
