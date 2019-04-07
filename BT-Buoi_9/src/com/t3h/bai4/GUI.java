package com.t3h.bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends JFrame {
    public static final int W_FRAME = 500;
    public static final int H_FRAME  = 250;

    private MyPanel panel;

    public GUI(){
        setTitle("Login");
        setSize(W_FRAME,H_FRAME);
        setVisible(false);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showConfirm();
            }
        };
        addWindowListener(adapter);
        panel = new MyPanel();
        add(panel);

    }

    private void showConfirm(){
        int result = JOptionPane.showConfirmDialog(this,"Do you want to exit !!","Confirm",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
}
