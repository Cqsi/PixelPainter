package com.cqsi.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel implements ActionListener{

    private JButton palette, rubber, pen;

    public BottomPanel(){

        Box box = Box.createHorizontalBox();

        palette = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\palette.png");
        rubber = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\rubber.jpg");
        pen = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\pen.jpg");

        box.add(palette);
        box.add(rubber);
        box.add(pen);
        this.add(box);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == palette){
            Panel.setColor(JColorChooser.showDialog(null, "Choose a color", Color.BLACK));
        }else if(e.getSource() == rubber){

            if(!Panel.isIsRubber()){
                Panel.setIsRubber(true);
            }

        }else if(e.getSource() == pen){

            if(Panel.isIsRubber()){
                Panel.setIsRubber(false);
            }

        }
    }

    private JButton makeMeButtons(String iconFile){

        JButton theBut = new JButton(new ImageIcon(((new ImageIcon(iconFile)
                .getImage()
                .getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH)))));

        theBut.addActionListener(this);

        return theBut;
    }
}
