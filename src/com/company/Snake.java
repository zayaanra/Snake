package com.company;

import controller.Point;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    List<Point> coordinates;
    final int SIZE = 25, STARTX = 150, STARTY = 150;

    int xDir, yDir;
    boolean movement, stretch;

    public Snake() {
        coordinates = new ArrayList<Point>();
        xDir = 0;
        yDir = 0;
        movement = false;
        stretch = false;
        coordinates.add(new Point(STARTX, STARTY));
        for(int i = 1; i < SIZE; i++) {
            coordinates.add(new Point(STARTX - i * 4, STARTY));
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        for (Point p : coordinates) {
            g.fillRect(p.getX(), p.getY(), 5, 5);
        }
    }

    public int getxDir() {
        return xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setXDir(int x) {
        xDir = x;
    }

    public void setYDir(int y) {
        yDir = y;
    }

    /* x-coordinate for head */
    public int getX() {
     return coordinates.get(0).getX();
    }

    /* y-coordinate for head */
    public int getY() {
        return coordinates.get(0).getY();
    }
}
