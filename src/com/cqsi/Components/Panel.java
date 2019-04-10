package com.cqsi.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {

    private int width, height;
    private int lineSpacing;

    private Color color;

    public Panel(int width, int height, int lineSpacing){
        this.width = width;
        this.height = height;
        this.lineSpacing = lineSpacing;

        color = JColorChooser.showDialog(null, "Enter the color!", Color.BLACK);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.GRAY.brighter());

        // X
        for(int i = 0; i < width; i+=lineSpacing){
            g.drawLine(i, 0, i, height);
        }

        // Y
        for(int i = 0; i < height; i+=lineSpacing){
            g.drawLine(0, i, width, i);
        }
    }


    // MouseEvents

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillRect((e.getX()/lineSpacing)*lineSpacing, (e.getY()/lineSpacing)*lineSpacing, lineSpacing, lineSpacing);
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillRect((e.getX()/lineSpacing)*lineSpacing, (e.getY()/lineSpacing)*lineSpacing, lineSpacing, lineSpacing);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
