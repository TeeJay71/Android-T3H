package com.t3h.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends JFrame {
    private MyPanel myPanel;
    private MyPanel2 myPanel2;
    public GUI(){
        setSize(1000,600);
        setTitle("Demo Swing");
        setBackground(Color.black);
        setResizable(false);
        setLocation(100,100);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showConfirm();
            }

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Chuong trinh dang chay");;
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Chuong trinh da duoc dong");
            }
        };
        addWindowListener(adapter);
        setLayout(null);
        myPanel =new MyPanel();
        add(myPanel);
        myPanel2 = new MyPanel2();
        add(myPanel2);
    }

    private void showConfirm(){
        int result = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Comfirm",
                JOptionPane.YES_NO_OPTION
        );
        if(result==JOptionPane.YES_OPTION){
            System.exit(0);   /// tắt đột ngột
        }
    }

}
