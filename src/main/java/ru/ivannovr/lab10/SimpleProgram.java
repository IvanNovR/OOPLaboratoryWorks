package ru.ivannovr.lab10;

import javax.swing.*;
import java.awt.*;

public class SimpleProgram extends JFrame {
    public SimpleProgram() {
        super("Простая программа");
        int[] screenSize = getScreenSize();
        super.setBounds(screenSize[0] / 2 - 100, screenSize[1] / 2 - 100, 200, 200);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 1));

        JTextField first_field = new JTextField("Привет", 1);
        JTextField second_field = new JTextField("мир!", 1);

        JButton button = new JButton("Нажмите");

        container.add(first_field);
        container.add(second_field);
        container.add(button);

        button.addActionListener(new ButtonEventManager());
    }

    private static int[] getScreenSize() {
        int[] result = new int[2];
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        result[0] = (int) screenSize.getWidth();
        result[1] = (int) screenSize.getHeight();
        return result;
    }
}
