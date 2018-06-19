package com.tw.taichung.joonkuiliew.ieeb_building;

import android.graphics.Bitmap;

public class Teacher {
    private String teacher_name;
    private String teacher_dep;
    private String tel;
    private String office;
    private String email;
    private Bitmap img;
    private String[] skill;
    private Inexperiment[] experiment;
    private Education[] education;

    public Teacher(String teacher_name, String teacher_dep,String tel,String office,String email,Bitmap img,String[] skill,Inexperiment[] newexperiment,Education[] education) {
        this.teacher_name = teacher_name;
        this.teacher_dep = teacher_dep;
        this.experiment = newexperiment;
        this.education = education;
        this.tel = tel;
        this.office = office;
        this.email = email;
        this.img = img;
        this.skill = skill;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_dep() {
        return teacher_dep;
    }

    public void setTeacher_dep(String teacher_dep) {
        this.teacher_dep = teacher_dep;
    }

    public Inexperiment[] getExperiment() {
        return experiment;
    }

    public void setExperiment(Inexperiment[] experiment) {
        this.experiment = experiment;
    }

    public Education[] getEducation() {
        return education;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }
}
