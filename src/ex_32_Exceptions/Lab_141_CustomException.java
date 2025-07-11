package ex_32_Exceptions;

public class Lab_141_CustomException {
    public static void main(String[] args) throws Bank.Custom_Exception {

        Bank icici = new Bank("INR",100);
        Bank sbi = new Bank("INR",200);
        int total = icici.addAmount(sbi);
        System.out.println(total);    // 300


        Bank hdfc = new Bank("USD",800);    // how INR+USD is possible so add exception
        int total1 = hdfc.addAmount(sbi);
        System.out.println(total1);      //1000


    }
}
