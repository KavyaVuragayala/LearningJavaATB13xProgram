package ex_20_Constructor;

// ************************************ PARAMETERIZED CONSTRUCTOR ********************

public class Lab_101_ParameterizedConst {
    public static void main(String[] args) {
        Baby1 b1= new Baby1();
        System.out.println(b1.name);  // this will print John by default

        Baby1 b2= new Baby1("Alice",01,07,2025);
        System.out.println("Name :" + b2.name  +"\ndob : " + b2.date+"/"+b2.month+"/"+b2.year );

        Baby1 b3= new Baby1("Rexa");

        Baby1 b4= new Baby1("Lonie",01);
    }
}

class Baby1{

    String name ;
    int date;
    int month;
    int year;

    Baby1(){
        System.out.println("Default ");
        name ="John";
    }

    Baby1(String name_input, int date_input,int month_input , int year_input){

        this.name = name_input;       // this is a reference variable that refers to the current object**
        this.date=date_input;        // it acts as b1.date
        this.month=month_input;
        this.year=year_input;

    }

    // Overloading

    Baby1(String name_input){                      // we have same const name wth diff parameters

        this.name = name_input;

    }

    Baby1(String name_input, int date_input) {

        this.name = name_input;
        this.date = date_input;

    }
}
