package ex_02_Java_Basics;

public class Lab_009_MutipleTable {
    public static void main(String[] args) {

        int a= 3;
        for (int i=1 ; i<11 ;i++) {
            System.out.printf("%d X %d = %d \n", a,i, a*i);
        }



        // without for loop
        int num= 10;
        System.out.printf("%d X %d = %d", num,1, num*1).println();
        System.out.printf("%d X %d = %d", num,2, num*2).println();
        System.out.printf("...").println();
        System.out.printf("%d X %d = %d", num,10, num*10);
    }


}
