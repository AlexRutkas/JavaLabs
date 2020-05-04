package edu.labs.LAB5.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 {
    private JTextField inputField;
    private JTextField inputPassword;
    private JButton btnEnter;
    private JLabel username;
    private JLabel userpassword;
    private JPanel panel2;

    public Task2() {
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String dbLogin = "alex";
                String dbPassword = "vevxex163";

                if (inputField.getText().equals(dbLogin) && inputPassword.getText().equals(dbPassword)) {
                    inputField.setCaretColor(Color.RED);
                    JOptionPane.showMessageDialog(null, "Авторизація успішна!\n" + "Привіт "+dbLogin+"!");
                } else {
                    inputField.setCaretColor(Color.YELLOW);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Проста форма");
        frame.setContentPane(new Task2().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
