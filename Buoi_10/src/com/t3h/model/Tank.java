package com.t3h.model;

import com.t3h.gui.MyFrame;

import java.awt.*;

public class Tank {
    public static final int LEFT=0;
    public static final int RIGHT=1;
    public static final int UP=2;
    public static final int DOWN=3;

    protected int x;
    protected int y;
    protected int orient;
    protected int speed=9;

    protected Image[] images=new Image[4];//Dùng Image của awt

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(images[orient],x,y,null);
    }

    public void move(){
        int xR = x;
        int yR = y;
        switch (orient){
            case LEFT:
                x-=speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case UP:
                y-=speed;
                break;
            case DOWN:
                y+=speed;
                break;
        }
        //kiểm tra
        if(x<=0||x>= MyFrame.W_FRAME-images[orient].getWidth(null)){
            x=xR;
        }
        if(y<=0||y>=MyFrame.H_FRAME-images[orient].getHeight(null)-30){
            y = yR;
        }
    }
    public void setOrient(int orient){
        this.orient=orient;
    }
}
