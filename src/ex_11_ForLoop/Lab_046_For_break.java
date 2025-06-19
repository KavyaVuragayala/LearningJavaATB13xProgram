package ex_11_ForLoop;

public class Lab_046_For_break {
    public static void main(String[] args) {

        for(int i=1 ;i <50;i++)
        {
            if(i==5)
            {
                break; // comes out of loop
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
