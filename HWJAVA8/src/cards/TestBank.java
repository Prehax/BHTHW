package cards;

public class TestBank {
    public static void main(String[] args) {
        CreditCard card1 = new MasterCard("Longlong Xu", "00001", 5000);
        CreditCard card2 = new VisaCard("Long Xu", "00002", 500);

        card1.payBill(1000);
        card2.payBill(1000);

        card1.refund(1000);
        card2.refund(1000);
    }
}
