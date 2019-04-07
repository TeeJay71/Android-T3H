package com.t3h.bai3;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class HocSinh {
    private String hoTen;
    private String lop;
    private float diemTK;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, float diemTK) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTK = diemTK;
    }


    public void nhapThongTin(String ho_Ten, String lop_, float diem_TK) {
        try{
            File f = new File("D:/T3H/HS.txt");
            if(f.exists()==false){
                f.getParentFile().mkdir();
                f.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(f,true);
            String str = ho_Ten+"_"+lop_+"_"+diem_TK+"\n";
            out.write(str.getBytes());
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void inThongTin(String tenTK){
        try{
            File f = new File ("D:/T3H/HS.txt");
            if(f.exists()==false){
                JOptionPane.showMessageDialog(null,"File chưa tồn tại !!","None",JOptionPane.OK_OPTION);
                return;
            }
            FileInputStream in = new FileInputStream(f);
            ArrayList<String> strings= (ArrayList<String>) Files.readAllLines(f.toPath());
            for (String s:strings) {
                String subName = s.substring(s.indexOf(""),s.indexOf("_"));
                if (subName.equals(tenTK)){
                    String sub = s.substring(s.indexOf(tenTK,s.indexOf("\n")));
                    JOptionPane.showMessageDialog(null,sub,"Finded",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
