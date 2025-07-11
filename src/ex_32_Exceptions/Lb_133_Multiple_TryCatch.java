package ex_32_Exceptions;

public class Lb_133_Multiple_TryCatch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ARE YOU FOOL");
        } catch (Exception e) {
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");
    }
}



/* exception here has a whole types of exceptions , that cannot be used first
  everytime first the smaller class here ArithmeticException should be used first

       try {
            int a = 10 / 0;
        }catch (Exception e) {
            System.out.println("ARE YOU FOOL");
        } catch (ArithmeticException e) {
            System.out.println("ARE YOU FOOL");
        }
*/