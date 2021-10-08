package com.danizml;

import javax.swing.*;
import java.awt.*;

public class GUI_Setup extends JFrame{

    private JPanel panelgui;
    private JButton startButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton startButton1;
    private JButton minecraftButton;
    private JButton blockButton;
    private JButton texturesButton;
    private JButton realmsButton;
    private JButton modelsButton;
    private JButton guiButton;
    private JButton itemButton;

    public GUI_Setup(){

        JFrame frame = new JFrame("Resource Create");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(450, 400));

        frame.add(panelgui);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
