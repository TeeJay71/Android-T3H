package com.t3h.sinhvien;

public class SinhVien {


    private String hoTen;
    private int tuoi;
    private float diem;


    public SinhVien(String hoTen, int tuoi, float diem) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public void inThongTin(){
        System.out.println("Ten: "+hoTen);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Diem: "+diem);
    }



}
