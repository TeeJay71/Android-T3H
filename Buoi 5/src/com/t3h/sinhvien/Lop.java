package com.t3h.sinhvien;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lop{
    private ArrayList<SinhVien> arrSV = new ArrayList<>();

    public void them(SinhVien sinhVien){
        arrSV.add(sinhVien);
    }

    public void sua(int index,SinhVien sinhVien){
        arrSV.set(index,sinhVien);
    }

    public void xoa (int index){
        this.arrSV.remove(index);
    }

    public void sapXep() {
        arrSV.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiem()<o2.getDiem()){
                    return -1   ;
                }
                return 0;
            }
        });
    }

    public void plus(int diemc){
        for (SinhVien s:arrSV) {
            if (s.getDiem()<=diemc){
                s.setDiem(s.getDiem()+3);
            }
        }
    }

    public void deleteScore(int diemc){
        for (int i = arrSV.size()-1; i >= 0  ; i--) {
            if(arrSV.get(i).getDiem()<diemc )arrSV.remove(i);

        }
    }

    public void in(){
        for (SinhVien s:arrSV) {
            s.inThongTin();
        }
        System.out.println("=======================");
    }


}
