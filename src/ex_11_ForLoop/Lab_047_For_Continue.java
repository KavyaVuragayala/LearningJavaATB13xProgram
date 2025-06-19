package ex_11_ForLoop;

public class Lab_047_For_Continue {
    public static void main(String[] args) {
        for(int i=1 ;i <50;i++)
        {
            if(i==5)
            {
                continue; // skips when i=5
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
