package com.cqsi.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {

    private int width, height;
    private final int lineSpacing = 20;

    private Color color;

    public Panel(int width, int height){
        this.width = width;
        this.height = height;

        color = JColorChooser.showDialog(null, "Enter the color!", Color.BLACK);

        addMouseListener(this);
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
}
