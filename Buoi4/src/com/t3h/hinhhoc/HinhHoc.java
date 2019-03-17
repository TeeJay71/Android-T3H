package com.t3h.hinhhoc;

public abstract class HinhHoc {
    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    protected String tenHinh;


    public abstract void tinhDienTich();

    public abstract void tinhChuVi();

    public void inThongTin(){
        System.out.printf("Hinh : "+tenHinh);
    }
}
