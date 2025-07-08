package ex_23_Encapsulation;

public class Lav_109_Encap {
    public static void main(String[] args) {
        VWOLogin v = new VWOLogin("Alice","Alic@123");
        System.out.println(v.username);
        System.out.println(v.password);

        goodVWO g = new goodVWO("admin","admin@123");
       // System.out.println(g.username);
        //System.out.println(g.password);    these are not possible because the access variables are declared as private

       // System.out.println(g.getPassword());
        g.setPassword("Pass@123",false);

       String toSetPassword= g.getPassword();
        System.out.println(toSetPassword);

    }
}

 // not an encapsulated class
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username , String password){
        this.username = username;
        this.password=password;
    }
}

// encapsulated class
class goodVWO{
    private String username;
    private String password;

    public goodVWO(String username , String password){
        this.username = username;
        this.password=password;
    }

    // to access these private variables we can use getter and setter method
    public String getUsername(){

        return username;
    }
    public String setUsername(String username){

        return username;
    }
    public String getPassword(){

        return password;
    }
    public void setPassword(String password,boolean isAdmin){
        if(isAdmin){
            this.password=password;
        }
        else {
            System.out.println("you dont have access to password");

        }
    }




}
