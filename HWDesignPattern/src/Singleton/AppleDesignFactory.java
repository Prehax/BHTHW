package Singleton;

public class AppleDesignFactory {
    static AppleDesignFactory instance;

    private AppleDesignFactory(){}

    public static synchronized AppleDesignFactory getInstance() {
        if (instance == null) {
            instance = new AppleDesignFactory();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // prevent from deserializing generate a new instance
    protected AppleDesignFactory readResolve() {
        return getInstance();
    }
}
