package com.t3h.butve;

public class MauVang extends ButVe{
    public MauVang(String mauCuaBut) {
        super(mauCuaBut);
    }

    @Override
    public void ve() {
        System.out.println(mauCuaBut);
    }

}
