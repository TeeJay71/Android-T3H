package com.t3h.music;

public abstract class Music {
    protected String tenBaiHat;
    protected String tenCaSi;
    protected String dungLuong;
    protected String thoiGian;

    public Music(String tenBaiHat, String tenCaSi, String dungLuong, String thoiGian) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.dungLuong = dungLuong;
        this.thoiGian = thoiGian;
    }

    public void play(){
        System.out.println("play bai hat");

    };
    public void pause(){
        System.out.println("Bai hat da duoc dung lai");
    };
    public void next(){
        System.out.println("Bai hat da duoc bo qua");
    };
    public void back(){
        System.out.println("Da quay lai bai hat truoc do");
    };





}
