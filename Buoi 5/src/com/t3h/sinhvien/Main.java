package com.t3h.sinhvien;

public class Main {
    public static void main(String[] args) {
        Lop lop = new Lop();
        lop.them(new SinhVien("Tet$uJa",21,8.2f));
        lop.them(new SinhVien("Nguyen Van A",22,5.9f));
        lop.them(new SinhVien("Le Thi B",21,6.9f));
        lop.them(new SinhVien("Tran Van C",22,0.1f));
        lop.them(new SinhVien("ABC",21,3f));
        lop.in();
        lop.sua(2,new SinhVien("Bung Thi Lua",19,9.0f));
        lop.xoa(1);
        lop.in();
        lop.sapXep();
        lop.in();

        lop.plus(5);
        lop.deleteScore(5);
        lop.in();
    }
}
