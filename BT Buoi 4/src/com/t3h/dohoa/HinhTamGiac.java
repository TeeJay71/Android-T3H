package com.t3h.dohoa;

import com.t3h.butve.MauVang;

public class HinhTamGiac extends HinhHoc{
    private MauVang mauVang;

    public HinhTamGiac(String tenHinh, MauVang mauVang) {
        super(tenHinh);
        this.mauVang = mauVang;
    }

    @Override
    public void ve() {
        System.out.println(tenHinh+" duoc ve bang "+mauVang.mauCuaBut);
    }
}
