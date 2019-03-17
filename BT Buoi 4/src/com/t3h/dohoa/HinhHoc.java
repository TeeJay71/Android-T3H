package com.t3h.dohoa;

import com.t3h.butve.ButVe;

public abstract class HinhHoc {
    protected String tenHinh;



    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;

    }

    public abstract void ve();
}
