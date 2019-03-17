package com.t3h.connguoi;

import com.t3h.dongvat.Meo;

public class NguoiMau extends  ConNguoi{
    private Meo meo;
    private String congTyQuanLy;

    public NguoiMau(String ten, int tuoi, String diaChi, String ngheNghiep, boolean gioiTinh, Meo meo, String congTyQuanLy) {
        super(ten, tuoi, diaChi, ngheNghiep, gioiTinh);
        this.meo = meo;
        this.congTyQuanLy = congTyQuanLy;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cong ty quan ly : "+congTyQuanLy);
        meo.inThongTin();
        meo.batChuot();
    }

    @Override
    public void datDongVatDiDao() {
        System.out.println("Dua meo di shopping");
    }
}
