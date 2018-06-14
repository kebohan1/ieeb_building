package com.tw.taichung.joonkuiliew.ieeb_building;

public class Teacher {
    private String teacher_name;
    private String teacher_dep;

    public Teacher(String teacher_name, String teacher_dep) {
        this.teacher_name = teacher_name;
        this.teacher_dep = teacher_dep;
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
}
