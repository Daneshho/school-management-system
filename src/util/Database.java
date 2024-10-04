package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/schoolmanagementsystem";
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "3475";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }
    public Statement getSQLStatement() throws SQLException {
        return this.getConnection().createStatement();
    }
}
