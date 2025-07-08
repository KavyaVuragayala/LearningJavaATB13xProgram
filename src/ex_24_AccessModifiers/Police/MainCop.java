package ex_24_AccessModifiers.Police;

public class MainCop {

    private String idcard ;
    private int gun_bullets;

    public MainCop(int gun_bullets){
        this.gun_bullets = gun_bullets;
    }

    protected void shoot(){
        System.out.println("Yes you can shoot !!");
    }
}
