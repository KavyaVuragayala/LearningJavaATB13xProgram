package ex_30_ENUM;

public class Lab_122_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.monday);
        System.out.println(projectnames.vw);

    }
}

enum Day{
    sunday,monday,tuesday
}

enum projectnames{
    google,katalon,vw
}

// instead of
// class A{
// String[] a ={"sunday","monday","tuesday"};
//}
