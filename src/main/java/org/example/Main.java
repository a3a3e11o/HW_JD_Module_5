package org.example;

import org.example.entities.*;
import org.example.services.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DatabaseConnectionService.getInstance().getConnection();

        new DatabaseInitService(connection,"sql/init_db.sql");
        new DatabasePopulateService(connection,"sql/populate_db.sql");

        System.out.println("==================================================");

        DatabaseQueryService queryServiceMaxProjectCountClient = new DatabaseQueryService();
        List<MaxProjectCountClient> maxProjectCountClients;
        maxProjectCountClients = queryServiceMaxProjectCountClient.findMaxProjectsClient(connection,"sql/find_max_projects_client.sql");

        for (MaxProjectCountClient client : maxProjectCountClients) {
            System.out.println("Client Name: " + client.getName() + ", Project Count: " + client.getProjectCount());
        }

        System.out.println("==================================================");

        DatabaseQueryService queryServiceLongestMonthsProject = new DatabaseQueryService();
        List<LongestMonthsProject> longestMonthsProject;
        longestMonthsProject = queryServiceLongestMonthsProject.findLongestProject(connection,"sql/find_longest_project.sql");

        for (LongestMonthsProject project : longestMonthsProject) {
            System.out.println("Project Name: " + project.getProject_id() + ", Month Count: " + project.getMonthCount());
        }

        System.out.println("==================================================");

        DatabaseQueryService queryServiceMaxSalaryAmountWorker = new DatabaseQueryService();
        List<MaxSalaryAmountWorker> maxSalaryAmountWorker;
        maxSalaryAmountWorker = queryServiceMaxSalaryAmountWorker.findMaxSalaryWorker(connection,"sql/find_max_salary_worker.sql");

        for (MaxSalaryAmountWorker worker : maxSalaryAmountWorker) {
            System.out.println("Worker Name: " + worker.getName() + ", Salary Amount: " + worker.getSalaryAmount());
        }

        System.out.println("==================================================");

        DatabaseQueryService queryServiceYoungestEldestBirthdayWorkers = new DatabaseQueryService();
        List<YoungestEldestBirthdayWorkers> youngestEldestBirthdayWorkers;
        youngestEldestBirthdayWorkers = queryServiceYoungestEldestBirthdayWorkers.findYoungestEldestWorkers(connection,"sql/find_youngest_eldest_workers.sql");

        for (YoungestEldestBirthdayWorkers worker : youngestEldestBirthdayWorkers) {
            System.out.println("Type: " + worker.getType() + ", Worker Name: " + worker.getName() + ", Birthday Date: " + worker.getBirthdayDate());
        }

        System.out.println("==================================================");

        DatabaseQueryService queryServicePrintProjectAmountPrices = new DatabaseQueryService();
        List<PrintProjectAmountPrices> printProjectAmountPrices;
        printProjectAmountPrices = queryServicePrintProjectAmountPrices.findPrintProjectPrices(connection,"sql/print_project_prices.sql");

        for (PrintProjectAmountPrices project : printProjectAmountPrices) {
            System.out.println("Project Name: " + project.getProject_id() + ", Project Price: " + project.getPriceAmount());
        }

        connection.close();
    }
}
