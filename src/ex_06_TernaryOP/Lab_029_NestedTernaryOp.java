package ex_06_TernaryOP;
public class Lab_029_NestedTernaryOp {
    public static void main(String[] args) {
        // condition1 ? expression 1 : (condition 2 ? expression 2 :expression 3 )
        // Age Classification
        //age < 18 ----> Minor
        //age >18 and <65 -----> Adult
        //age >65 ----? Senior

        int age =92;
        String result = age<18 ? "Minor " : (age <65 ? "Adult" : "Senior") ;
        System.out.println(result);
    }
}
