package ex_32_Exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount){
        this.currency=currency;
        this.amount= amount;
    }

    public Integer addAmount(Bank bankName) throws Custom_Exception{
        if(this.currency.equals(bankName.currency)) {
            return bankName.amount + this.amount; // bankamount + myamount
        }
        else{
            throw new Custom_Exception("Currency mismatch");
        }
    }

    class Custom_Exception extends Exception{
        public Custom_Exception(String message){
            super(message);
        }
    }

}
