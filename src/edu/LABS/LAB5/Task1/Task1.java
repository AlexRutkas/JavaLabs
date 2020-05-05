package edu.labs.LAB5.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 {
    private JPanel panel1;
    private JButton btnPress;

    private int clickCount = 0;

    public Task1() {
        btnPress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickCount++;

                String message = "Кнопку натиснули " + clickCount;
                int n = clickCount % 10;
                if (n >= 2 && n <= 4) {
                    message += " рази";
                } else {
                    message += " разів";
                }
                if (clickCount == 1) {
                    btnPress.setText("Дуже добре");
                } else {
                    btnPress.setText(message);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Проста форма");
        frame.setContentPane(new Task1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
