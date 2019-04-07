package com.t3h.bai2;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends JFrame {
    public static final int W_FRAME = 500;
    public static final int H_FRAME = 400;
    private MyPanel panel;

    public GUI(){
        setTitle("PRIME Tool");
        setSize(W_FRAME,H_FRAME);
        setVisible(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        panel=new MyPanel();
        add(panel);

        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showConfirm();
            }
        };
        addWindowListener(adapter);
    }

    private void showConfirm() {
        int result=JOptionPane.showConfirmDialog(this,
                "Bạn muốn tắt chương trình ???","CONFIRM",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){System.exit(0);}

    }
}
