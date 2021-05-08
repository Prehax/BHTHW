package cards;

public class MasterCard extends CreditCard {

    public MasterCard() {
        this.holderName = "";
        this.cardNumber = "";
        this.accountBalance = 0;
        this.cardType = "MasterCard";
    }

    public MasterCard(String holderName, String cardNumber, int accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = "MasterCard";
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return this.cardType.equals(cardType);
    }
}
