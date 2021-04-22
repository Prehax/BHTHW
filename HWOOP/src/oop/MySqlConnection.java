package oop;

class MySqlConnection implements DatabaseConnection {

    @Override
    public Connection getConnection() {
        return new Connection("localhost", "MySql");
    }
}
