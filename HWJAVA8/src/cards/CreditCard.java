package cards;

public abstract class CreditCard {
    protected String holderName;
    protected String cardNumber;
    protected double accountBalance;
    protected String cardType;

    abstract boolean isCardAcceptable(String cardType);
    public boolean payBill(double bill) {
        if (this.accountBalance >= bill) {
            this.accountBalance -= bill;
            System.out.println("Pay "+bill+" successfully, now has "+accountBalance);
            return true;
        } else {
            System.out.println("No enough balance! only has "+accountBalance);
            return false;
        }

    }

    public double refund(double amount) {
        this.accountBalance += amount;
        System.out.println("Refund "+amount+" successfully, now has "+accountBalance);
        return this.accountBalance;
    }

}

/*
JAVA8，第一题， interface里面的变量都是final static， 不可被更改的。
那么这个default payBill（）方法就无法修改accountBalance值，所以这个该怎么写。
 */
