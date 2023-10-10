package org.example.services;

import org.example.entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public List<MaxProjectCountClient> findMaxProjectsClient(Connection connection, String fileName) {
        List<MaxProjectCountClient> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                MaxProjectCountClient client;
                client = new MaxProjectCountClient(resultSet.getString("CLIENT_NAME"), resultSet.getInt("PROJECT_COUNT"));
                result.add(client);
            }

            resultSet.close();
            preparedStatement.close();
            reader.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<LongestMonthsProject> findLongestProject(Connection connection, String fileName) {
        List<LongestMonthsProject> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                LongestMonthsProject project;
                project = new LongestMonthsProject(resultSet.getString("PROJECT_ID"), resultSet.getInt("MONTH_COUNT"));
                result.add(project);
            }

            resultSet.close();
            preparedStatement.close();
            reader.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<MaxSalaryAmountWorker> findMaxSalaryWorker(Connection connection, String fileName) {
        List<MaxSalaryAmountWorker> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                MaxSalaryAmountWorker worker;
                worker = new MaxSalaryAmountWorker(resultSet.getString("NAME"), resultSet.getInt("SALARY"));
                result.add(worker);
            }

            resultSet.close();
            preparedStatement.close();
            reader.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<YoungestEldestBirthdayWorkers> findYoungestEldestWorkers(Connection connection, String fileName) {
        List<YoungestEldestBirthdayWorkers> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                YoungestEldestBirthdayWorkers worker;
                worker = new YoungestEldestBirthdayWorkers(resultSet.getString("TYPE"), resultSet.getString("NAME"), resultSet.getString("BIRTHDAY"));
                result.add(worker);
            }

            resultSet.close();
            preparedStatement.close();
            reader.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<PrintProjectAmountPrices> findPrintProjectPrices(Connection connection, String fileName) {
        List<PrintProjectAmountPrices> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                PrintProjectAmountPrices project;
                project = new PrintProjectAmountPrices(resultSet.getString("PROJECT_ID"), resultSet.getInt("PRICE"));
                result.add(project);
            }

            resultSet.close();
            preparedStatement.close();
            reader.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}