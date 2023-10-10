package org.example.services;

import org.example.services.ReaderService;
import java.sql.Connection;

public class DatabaseInitService {
    public DatabaseInitService(Connection connection, String fileName) {
        new ReaderService(connection, fileName);
        System.out.println("Database successfully initialized!");
    }
}