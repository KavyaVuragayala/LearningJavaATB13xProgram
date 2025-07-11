package ex_32_Exceptions;

public class Lab_136_IQ3 {
    public static void main(String[] args) {
        int a=0;
        int b=0;    // these are initiliazation variables but not vulnerable code
        try {
            int c= 10/b;      // vulnerable code that should be in try and catch
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
