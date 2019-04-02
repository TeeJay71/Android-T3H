package com.t3h.gui;

import javax.swing.*;

public class MyFrame extends JFrame {
    public static final int W_FRAME=800;
    public static final int H_FRAME = 600;

    public MyFrame(){
        setTitle("Buoi 9");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        MyPanel panel = new MyPanel();
        add(panel);
    }

}
