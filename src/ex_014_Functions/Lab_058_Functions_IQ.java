package ex_014_Functions;

public class Lab_058_Functions_IQ {
    public static void main(String[] args) {

        // returns array os string and there should be only one main method
        // JVM only matches this main function
    }

    public static void main(String args) {

        // this is method overriding as it returns only string
    }

    public static int main(int args) {
        return 10;
    }

    public static float main(float args) {
        return 14.5f;
    }

    public static boolean main(boolean args) {
        return false;
    }
}
