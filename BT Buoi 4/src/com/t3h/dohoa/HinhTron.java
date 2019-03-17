package com.t3h.dohoa;

import com.t3h.butve.MauDo;

public class HinhTron extends HinhHoc{


    private MauDo mauDo;
    public HinhTron(String tenHinh, MauDo mauDo) {
        super(tenHinh);
        this.mauDo = mauDo;
    }

    @Override
    public void ve() {
        System.out.println(tenHinh+" duoc ve bang "+mauDo.mauCuaBut);
    }
}
