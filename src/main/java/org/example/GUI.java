package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GUI {
    public static void main(String[] args) {
        try {
            URL imageUrl = new URL("https://example.com/image.jpg");
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            JLabel imageLabel = new JLabel(imageIcon);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(imageLabel);

            String input = JOptionPane.showInputDialog(panel, "Enter something:");

            if (input != null) {
                System.out.println("Input: " + input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
