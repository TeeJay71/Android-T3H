package com.t3h.main;

import com.t3h.gui.MyFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e){
            e.printStackTrace();
        }
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
    }
}
