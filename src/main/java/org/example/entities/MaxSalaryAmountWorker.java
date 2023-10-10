package org.example.entities;

public class MaxSalaryAmountWorker {
    private String name;
    private int salaryAmount;

    public MaxSalaryAmountWorker(String name, int salaryAmount) {
        this.name = name;
        this.salaryAmount = salaryAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}