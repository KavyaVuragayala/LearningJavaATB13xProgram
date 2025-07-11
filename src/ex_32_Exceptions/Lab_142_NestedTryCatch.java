package ex_32_Exceptions;

public class Lab_142_NestedTryCatch {

        public static void main(String[] args) {
        /* Write a program with a try-catch block inside another try-catch block.
           Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.
 */
            int[] array = {1,2,3,4};
            int a= 10/0;
            try {
                System.out.println(array[9]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
    }


