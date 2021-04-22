package oop;

public class VisaCard extends CreditCard {

    public VisaCard(String holderName, String cardNumber, double accountBalance) {
        super(holderName, cardNumber, accountBalance);
        super.setCardType("VisaCredit");
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return cardType == this.getCardType();
    }
}
