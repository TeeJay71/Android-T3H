package com.t3h.danhba;

import java.util.ArrayList;

public class QuanLy{

    private ArrayList<DanhBa> listDB= new ArrayList<>();

    public void add(DanhBa danhBa){
        listDB.add(danhBa);
    }


    public int check(String gtSDT){
        for (DanhBa l:listDB) {
            if (l.getSoDT().equals(gtSDT)){
                l.toString();
                return 1;
            }
        }
        return -1;
    }

    public void sua(String gtSDT, String sDTMoi){
        for (DanhBa l:listDB) {
            if(l.getSoDT().equals(gtSDT)){
                l.setSoDT(sDTMoi);
            }
        }
    }

    public void themDB(DanhBa danhBa){
        int exists = check(danhBa.getSoDT());
        if(exists == -1){
            listDB.add(danhBa);
            System.out.println("Them thanh cong");
        }
        else {
            System.out.println("SDT da co san");
        }
    }

    public void print(){
        for (DanhBa l:listDB) {
            l.toString();
        }
        System.out.println("===============");
    }

}
