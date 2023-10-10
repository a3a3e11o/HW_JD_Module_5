package org.example.entities;

public class LongestMonthsProject {
    private String project_id;
    private int monthCount;

    public LongestMonthsProject(String project_id, int monthCount) {
        this.project_id = project_id;
        this.monthCount = monthCount;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }
}