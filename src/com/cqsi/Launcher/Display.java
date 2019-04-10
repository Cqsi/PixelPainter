package com.cqsi.Launcher;

import com.cqsi.Components.Panel;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private JFrame frame;
    private int width, height;
    private String title;

    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay(){

        frame = new JFrame(title);
        frame.add(new Panel(width, height), BorderLayout.CENTER);

        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
