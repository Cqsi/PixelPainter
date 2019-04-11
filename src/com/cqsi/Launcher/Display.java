package com.cqsi.Launcher;

import com.cqsi.Components.BottomPanel;
import com.cqsi.Components.Panel;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private JFrame frame;
    private int width, height, lineSpacing;
    private String title;

    public Display(String title, int width, int height, int lineSpacing){
        this.title = title;
        this.width = width;
        this.height = height;
        this.lineSpacing = lineSpacing;

        createDisplay();
    }

    private void createDisplay(){

        frame = new JFrame(title);

        frame.add(new Panel(width, height, lineSpacing), BorderLayout.CENTER);
        frame.add(new BottomPanel(), BorderLayout.SOUTH);

        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
