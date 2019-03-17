package com.t3h.main;

import com.t3h.connguoi.NguoiMau;
import com.t3h.connguoi.VanDongVien;
import com.t3h.dongvat.Cho;
import com.t3h.dongvat.Meo;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("Inu", 3, true, "Husky");
        VanDongVien vdv = new VanDongVien("Tes$uJa", 21, "Ha Noi", "Van dong vien bong da"
                , true, cho, 59, "MU", 71);
        vdv.inThongTin();
        vdv.datDongVatDiDao();
        System.out.printf("================================");
        Meo meo = new Meo("Neko", 2, false, "Ba tu");
        NguoiMau nm = new NguoiMau("Le Thi Vui", 24, "HCM", "Nguoi mau"
                , false, meo, "Cong ty XYZ");
        nm.inThongTin();
        nm.datDongVatDiDao();

    }
}
