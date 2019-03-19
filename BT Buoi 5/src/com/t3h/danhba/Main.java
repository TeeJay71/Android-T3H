package com.t3h.danhba;

public class Main{
    public static void main(String[] args) {
        QuanLy qLy = new QuanLy();
        qLy.add(new DanhBa("Tet$uJa","0123456789"));
        qLy.add(new DanhBa("Le Thi A","0456123789"));
        qLy.print();
        qLy.themDB(new DanhBa("ABC","0123456789"));
        qLy.themDB(new DanhBa("XYZ","09876543621"));
        qLy.print();
        qLy.sua("0123456789","01212343456");
        qLy.print();

    }
}
