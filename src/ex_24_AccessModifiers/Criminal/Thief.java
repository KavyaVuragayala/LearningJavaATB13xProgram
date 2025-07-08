package ex_24_AccessModifiers.Criminal;


import ex_24_AccessModifiers.Police.MainCop;

public class Thief {

    public static void main(String[] args) {

        MainCop thief = new MainCop(20);
      // thief.gun_bullets=20;
       // thief.shoot();   // if all the instance variables in MainCop class are private then this we be working
    }
}


