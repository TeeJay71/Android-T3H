package com.t3h.butve;

public class MauXanh extends ButVe {
    public MauXanh(String mauCuaBut) {
        super(mauCuaBut);
    }

    @Override
    public void ve() {
        System.out.println(mauCuaBut);
    }
}
