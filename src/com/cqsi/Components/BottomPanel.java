package com.cqsi.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel implements ActionListener{

    private JButton palette, rubber, pen;
    private Panel panel;

    public BottomPanel(int width, int height, int lineSpacing){

        panel = new Panel(width, height, lineSpacing);

        Box box = Box.createHorizontalBox();

        palette = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\palette.png");
        rubber = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\rubber.png");
        pen = makeMeButtons("C:\\Users\\Capsimir\\Desktop\\PixelPainter\\res\\images\\pen.jpg");

        box.add(palette);
        box.add(rubber);
        box.add(pen);

        add(box);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == palette){

            panel.setColor(JColorChooser.showDialog(null, "Choose a color", Color.BLACK));

        }else if(e.getSource() == rubber){

            if(!panel.isIsRubber()){
                panel.setIsRubber(true);
            }

        }else if(e.getSource() == pen){

            if(panel.isIsRubber()){
                panel.setIsRubber(false);
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
