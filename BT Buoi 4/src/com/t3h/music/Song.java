package com.t3h.music;

public class Song extends Music{
    public Song(String tenBaiHat, String tenCaSi, String dungLuong, String thoiGian) {
        super(tenBaiHat, tenCaSi, dungLuong, thoiGian);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(tenBaiHat+" "+tenCaSi+" "+thoiGian);
    }

    @Override
    public void next() {
        super.next();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void back() {
        super.back();
    }
}
