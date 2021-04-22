package oop;

public abstract class CreditCard {
    private String holderName;
    private String cardNumber;
    private double accountBalance;
    private String cardType="Credit";

    public CreditCard(String holderName, String cardNumber, double accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
    }

    public abstract boolean isCardAcceptable(String cardType);
    public boolean payBill(double bill) {
        if (accountBalance > bill) {
            accountBalance -= bill;
            return true;
        } else {
            return false;
        }
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardType() {
        return this.cardType;
    }


}
