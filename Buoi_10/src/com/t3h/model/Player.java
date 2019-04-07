package com.t3h.model;

import image.ImageLoader;

public class Player extends  Tank{

    public Player(int x, int y) {
        super(x, y);
        orient = UP;
        images[LEFT] = ImageLoader.getImage("player_green_left.png");
        images[RIGHT] = ImageLoader.getImage("player_green_right.png");
        images[UP] = ImageLoader.getImage("player_green_up.png");
        images[DOWN] = ImageLoader.getImage("player_green_down.png");

    }

}
