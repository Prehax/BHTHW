package exceptions;

public class ExceptionHandler {
    public void handleException(String cardType, String Address) {
        try {
            if ("AMEX".equals(cardType)) {
                throw new CardTypeException("Card type 'AMEX' is not acceptable.");
            } else if (!Address.contains("US")) {
                throw new AddressException("Address out of US is not acceptable");
            }
        } catch(Exception cte) {
            System.out.println(cte);
        }

        System.out.println("Execution complete.");

    }

}
