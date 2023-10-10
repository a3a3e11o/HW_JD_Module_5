package org.example.services;

import org.example.services.ReaderService;
import java.sql.Connection;

public class DatabasePopulateService {
    public DatabasePopulateService(Connection connection, String fileName) {
        new ReaderService(connection, fileName);
        System.out.println("The database tables are successfully populated!");
    }
}
