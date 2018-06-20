package com.tw.taichung.joonkuiliew.ieeb_building;

import java.io.Serializable;

public class Education implements Serializable {
    private String university;
    private String department;
    private String education;
    private static final long serialVersionUID = 2L;
    public Education(){

    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
