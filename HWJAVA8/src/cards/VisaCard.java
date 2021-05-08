package cards;

public class VisaCard extends CreditCard{
    public VisaCard() {
        this.holderName = "";
        this.cardNumber = "";
        this.accountBalance = 0;
        this.cardType = "MasterCard";
    }

    public VisaCard(String holderName, String cardNumber, int accountBalance) {
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
