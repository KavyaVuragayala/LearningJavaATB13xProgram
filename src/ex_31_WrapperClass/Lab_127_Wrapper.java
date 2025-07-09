package ex_31_WrapperClass;

import org.w3c.dom.ls.LSOutput;

public class Lab_127_Wrapper {
// includes all the concepts of OOPs
public static void main(String[] args) {


    SmartPhone s1 = new SmartPhone(1275, "Iphone14", 10000.0);
    s1.setPrice(200000.0);
    System.out.println(Covers.red.getColor());

}
}



class SmartPhone extends OldMobile{

    private Integer phonenumber;
    String mobilename;
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    SmartPhone(Integer phonenumber,String mobilename,Double price){
        this.phonenumber= phonenumber;
        this.mobilename = mobilename;
        this.price= price;
    }

    @Override
    void dialpad(){
        System.out.println("Its TouchPad Now!!!!");
    }

}
class OldMobile implements SIMcard{

    void dialpad(){
        System.out.println("Enter the phone number ");
    }
   public void enterCard(){
        System.out.println("Enter the card number");
    }
}

enum Covers{
    red("red_pokeman"),
    blue("blue_pokeman");
    private String color;
    Covers(String color){
        this.color =color;
    }

    String getColor(){
        return this.color;
    }


    }
interface SIMcard{
    void enterCard();
}


