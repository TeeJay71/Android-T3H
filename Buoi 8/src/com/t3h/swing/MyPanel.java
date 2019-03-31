package com.t3h.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel  extends JPanel {
    public MyPanel(){
        setSize(500,300);
        setBackground(Color.BLUE);
        setLocation(200,100);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClick blue ....");
                int exScr= e.getXOnScreen();
                int eyScr = e.getYOnScreen();
                System.out.println("exScr"+exScr);
                System.out.println("eyScr"+eyScr);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
