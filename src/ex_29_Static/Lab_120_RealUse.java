package ex_29_Static;

public class Lab_120_RealUse {
}

class ATB{

    private String name;
    private String phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    static String courseName = "ATB13x";
    static String mentorName= "Pramod";

    static void doAssignment(){
        System.out.println("Common to all");
    }

    void howTheyDoAssignment(){
        System.out.println("Different from one person to another person");
    }
}

