package ex_20_Constructor;

public class Lab_098_Const {
    public static void main(String[] args) {

        Baby b1= new Baby();

    }
}

class Baby{

    String name;

    Baby(){
        System.out.println("Default Const");

        // in real time class is used for anything before creation of object
        // fetch data from MySQL db...
        //Open a file and read the data(json , testdata.xlsx,txt file )
    }

    void cry(){
        System.out.println("cry");
    }
}
