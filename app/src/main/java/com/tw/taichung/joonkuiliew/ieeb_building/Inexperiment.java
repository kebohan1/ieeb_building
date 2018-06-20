package com.tw.taichung.joonkuiliew.ieeb_building;

import java.io.Serializable;

public class Inexperiment implements Serializable {
    private String department;
    private String jobs;
    private static final long serialVersionUID = 3L;
    public Inexperiment(){

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
}
