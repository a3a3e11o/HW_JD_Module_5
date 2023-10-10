package org.example.entities;

public class YoungestEldestBirthdayWorkers {
    private String type;
    private String name;
    private String birthdayDate;

    public YoungestEldestBirthdayWorkers(String type, String name, String birthdayDate) {
        this.type = type;
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}