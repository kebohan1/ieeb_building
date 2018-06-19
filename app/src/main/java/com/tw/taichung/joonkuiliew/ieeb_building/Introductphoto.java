package com.tw.taichung.joonkuiliew.ieeb_building;

import android.graphics.Bitmap;

public class Introductphoto {
    private String title;
    private int imgid;
    private int imgid_night;
    private Bitmap yourBitmap;

    public Introductphoto(String title, int imgid) {
        this.title = title;
        this.imgid = imgid;
        this.imgid_night = imgid;
    }

    public Introductphoto(String title, int imgid, int imgid_night) {
        this.title = title;
        this.imgid = imgid;
        this.imgid_night = imgid_night;
    }

    public Bitmap getYourBitmap() {
        return yourBitmap;
    }

    public void setYourBitmap(Bitmap yourBitmap) {
        this.yourBitmap = yourBitmap;
    }

    public int getImgid_night() {
        return imgid_night;
    }

    public void setImgid_night(int imgid_night) {
        this.imgid_night = imgid_night;
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
