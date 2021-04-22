package oop;

public class OracleConnection implements DatabaseConnection {

    @Override
    public Connection getConnection() {
        return new Connection("localhost", "Oracle");
    }
}
