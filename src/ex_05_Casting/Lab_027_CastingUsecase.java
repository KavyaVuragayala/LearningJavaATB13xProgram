package ex_05_Casting;

public class Lab_027_CastingUsecase {
    public static void main(String[] args){
        //choose appropriate type casting
        int salary= 100;
        float GST = 18.45f;
        int total = salary + (int)GST ; // data loss
        float total1 = (float)salary + GST ; //no data loss ---> explicit
        float total2 = salary + GST ; // Widening auto -implicit as we are converting int to float

        System.out.println(total);
        System.out.println(total1);
        System.out.println(total2);
    }
}
