package com.t3h.bai1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PTBac2  {
    public float a,b,c;
    public float x1,x2;


    public PTBac2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String GiaiPT(float  a, float b, float c ) {
        String ketQua = "";
        if (a == 0) {
            if (b == 0) {
                ketQua ="Phương trình vô nghiệm!";
            } else {
                ketQua = "Phương trình có một nghiệm: "
                        + "x = " + (-c / b);
            }
        }
        // tính delta
        float delta = b * b - 4 * a * c;

        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            ketQua = "Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketQua = "Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1;
        } else {
             ketQua = "Phương trình vô nghiệm!";
        }

        return ketQua;
    }
}
