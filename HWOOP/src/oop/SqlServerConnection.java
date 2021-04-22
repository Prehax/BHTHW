package oop;

class SqlServerConnection implements DatabaseConnection {

    @Override
    public Connection getConnection() {
        return new Connection("localhost", "SqlServer");
    }
}