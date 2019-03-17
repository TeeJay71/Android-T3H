package com.t3h.music;

public class Video extends Music{
    private String tenAlbum;

    public Video(String tenBaiHat, String tenCaSi, String dungLuong, String thoiGian, String tenAlbum) {
        super(tenBaiHat, tenCaSi, dungLuong, thoiGian);
        this.tenAlbum = tenAlbum;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(tenBaiHat+" "+tenCaSi+" "+thoiGian+" "+tenAlbum);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void next() {
        super.next();
    }

    @Override
    public void back() {
        super.back();
    }
}

