package com.t3h.hinhhoc;

public class HinhChuNhat extends HinhHoc {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat(String tenHinh, float chieuDai, float chieuRong) {
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhDienTich() {
        System.out.printf("Dien tich hinh chu nhat = " + (chieuDai * chieuRong));

    }

    @Override
    public void tinhChuVi() {
        System.out.printf("Chu vi hinh chu nhat = " + ((chieuDai + chieuRong) / 2));

    }

    public void inThongTin() {
        super.inThongTin();
        System.out.printf("Chieu dai = " + chieuDai);
        System.out.printf("Chieu rong = " + chieuRong);
    }
}
