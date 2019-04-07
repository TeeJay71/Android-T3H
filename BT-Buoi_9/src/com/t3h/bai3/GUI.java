package com.t3h.bai3;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends JFrame {
    public static final int W_FRAME = 600;
    public static final int H_FRAME = 400;
    private MyPanel panel;

    public GUI(){
        setSize(W_FRAME,H_FRAME);
        setTitle("Student !!!");
        setVisible(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        panel = new MyPanel();
        add(panel);
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showCorfirm();
            }
        };
        addWindowListener(adapter);
    }

    private void showCorfirm() {
        int result = JOptionPane.showConfirmDialog(null,"Do you want to close !!","Confirm",JOptionPane.YES_NO_OPTION);
        if (result==JOptionPane.YES_OPTION)System.exit(0);
    }
}
