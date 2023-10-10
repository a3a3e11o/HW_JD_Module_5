package org.example.services;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReaderService {
    public ReaderService(Connection connection, String fileName) {
        if (connection != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                StringBuilder sql = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sql.append(line);
                    if (line.trim().endsWith(";")) {
                        try (PreparedStatement preparedStatement = connection.prepareStatement(sql.toString())) {
                            preparedStatement.executeUpdate();
                        }
                        sql.setLength(0);
                    }
                }
                reader.close();
            } catch (SQLException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

