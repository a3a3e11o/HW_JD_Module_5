package org.example.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionService {
    private static final String url = "jdbc:postgresql://localhost:5432/megasoft";
    private static final String user = "postgres";
    private static final String password = "123";
    private static final DatabaseConnectionService INSTANCE = new DatabaseConnectionService();
    private static Connection connection;

    private DatabaseConnectionService() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            System.out.printf("Can't create connection. Reason: %s%n", e.getMessage());
            throw new RuntimeException("Can't create connection.");
        }
    }

    public static DatabaseConnectionService getInstance() {
        return INSTANCE;
    }

    public static Connection getConnection() {
        return connection;
    }
}