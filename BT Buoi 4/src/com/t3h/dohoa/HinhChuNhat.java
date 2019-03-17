package com.t3h.dohoa;

import com.t3h.butve.MauXanh;

public class HinhChuNhat extends HinhHoc{
    private MauXanh mauXanh;

    public HinhChuNhat(String tenHinh, MauXanh mauXanh) {
        super(tenHinh);
        this.mauXanh = mauXanh;
    }

    @Override
    public void ve() {
        System.out.println(tenHinh+" duoc ve bang "+mauXanh.mauCuaBut);
    }
}

