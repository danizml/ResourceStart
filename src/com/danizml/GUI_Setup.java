package com.danizml;

import javax.swing.*;
import java.awt.*;

public class GUI_Setup {

    private JPanel GUI;

    public GUI_Setup(){

        JFrame frame = new JFrame("Resource Create");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));

        frame.add(GUI);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
