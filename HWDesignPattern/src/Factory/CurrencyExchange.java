package Factory;

public class CurrencyExchange {
    public static Currency getCurrency(String currency) {
        if ("China".equals(currency)) {
            RMB rmb = new RMB();
            return rmb.makeCurrency();
        } else if ("America".equals(currency)) {
            USD usd = new USD();
            return usd.makeCurrency();
        } else {
            System.out.println("There is no such country!");
            return null;
        }
    }
}

abstract class Currency {
    abstract public Currency makeCurrency();
}

class RMB extends Currency {
    @Override
    public Currency makeCurrency() {
        // add RMB special material
        return new RMB();
    }
}

class USD extends Currency {

    @Override
    public Currency makeCurrency() {
        // add USD special material
        return new USD();
    }
}
