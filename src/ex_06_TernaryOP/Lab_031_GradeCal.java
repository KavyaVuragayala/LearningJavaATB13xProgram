package ex_06_TernaryOP;

public class Lab_031_GradeCal {
    public static void main(String[] args) {
        //   Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        int marks = 73;
        String Grade = (marks>=90) ? "A+" : (marks<90 && marks>=75) ? "A": (marks<75 && marks >=60) ? "B" : "C" ;
        System.out.println(Grade);

    }
}
