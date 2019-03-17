package com.t3h.hinhhoc;

public class HinhTron extends HinhHoc {
    private float r;

    public HinhTron(String tenHinh, float r) {
        super(tenHinh);
        this.r = r;
    }

    @Override
    public void tinhDienTich() {
        System.out.printf("Dien tich hinh tron = " + (r * r * 3.14));
    }

    @Override
    public void tinhChuVi() {
        System.out.printf("Chu vi hinh tron = " + (2 * r * 3.14));

    }

    public void inThongTin() {
        super.inThongTin();
        System.out.printf("Ban kinh hinh tron = " + r);
    }
}
