package com.tw.taichung.joonkuiliew.ieeb_building;

public class Introductphoto {
    String title;
    int imgid;

    public Introductphoto(String title, int imgid) {
        this.title = title;
        this.imgid = imgid;
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
