package com.t3h.gui;

import com.t3h.manager.GameManager;
import com.t3h.model.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    private GameManager manager = new GameManager();

    public MyPanel(){
        setBackground(Color.BLACK);
        manager.initGame();
        //set KeyListener
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
//        g2d.setColor(Color.red);
//        g2d.setStroke(new BasicStroke(20));   //thay đổi nét vẽ
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING
//                  ,RenderingHints.VALUE_ANTIALIAS_ON);   //làm đường vẽ mượt hơn(mịn hơn)
//        g2d.drawLine(0,0,100,100);
//        g2d.drawRect(200,200,100,100);
//        g2d.drawOval(400,200,50,50);
        manager.draw(g2d);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            manager.playerMove(Tank.LEFT);
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            manager.playerMove(Tank.RIGHT);
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            manager.playerMove(Tank.UP);
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            manager.playerMove(Tank.DOWN);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
