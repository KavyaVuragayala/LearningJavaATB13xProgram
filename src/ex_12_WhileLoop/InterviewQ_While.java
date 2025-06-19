package ex_12_WhileLoop;

public class InterviewQ_While {
    public static void main(String[] args) {
        int i=10;
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }


        int j=0;
        while(j<0)
        {
            System.out.println(j);
            j++; // no output
        }
    }
}
