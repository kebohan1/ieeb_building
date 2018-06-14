package com.tw.taichung.joonkuiliew.ieeb_building;

public class Department {
    private String title;
    private int imgid;
    private String introduct_dep;

    public Department(String title, int imgid) {
        this.title = title;
        this.imgid = imgid;
    }

    public Department(String title, int imgid,String introduct_dep) {
        this.title = title;
        this.imgid = imgid;
        this.introduct_dep = introduct_dep;
    }

    public String getIntroduct_dep() {
        return introduct_dep;
    }

    public void setIntroduct_dep(String introduct_dep) {
        this.introduct_dep = introduct_dep;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
