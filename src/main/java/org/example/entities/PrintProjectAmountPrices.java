package org.example.entities;

public class PrintProjectAmountPrices {
    private String project_id;
    private int priceAmount;

    public PrintProjectAmountPrices(String project_id, int priceAmount) {
        this.project_id = project_id;
        this.priceAmount = priceAmount;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public int getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(int priceAmount) {
        this.priceAmount = priceAmount;
    }
}