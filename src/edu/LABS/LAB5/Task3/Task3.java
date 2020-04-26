package edu.labs.LAB5.Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {
    private JComboBox comboBox1;
    private JCheckBox CheckBox1;
    private JCheckBox CheckBox2;
    private JCheckBox CheckBox3;
    private JComboBox comboBox2;
    private JButton btnOrder;
    private JPanel panel3;
    private JLabel statusinfo;

    private int hourBegin = 6;
    private int hourEnd = 22;

    public Task3() {

        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        Date date = new Date();
        int time = Integer.parseInt(formatter.format(date));

        if (time >= hourBegin && time <= hourEnd) {
            statusinfo.setText("Відчинено!");
            statusinfo.setForeground(Color.GREEN);
        } else {
            statusinfo.setText("Задчинено!");
            statusinfo.setForeground(Color.RED);
            btnOrder.setEnabled(false);
        }

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String vydMorozuva = comboBox1.getSelectedItem().toString();
                String dobavka = comboBox2.getSelectedItem().toString();
                String tupyDobavok = "";
                if (CheckBox1.isSelected()) {
                    tupyDobavok += CheckBox1.getText();
                }
                if (CheckBox2.isSelected()) {
                    tupyDobavok += ", " + CheckBox2.getText();
                }
                if (CheckBox3.isSelected()) {
                    tupyDobavok += ", " + CheckBox3.getText();
                }
                String result = "Ваше замовлення:" +
                        "\nВид морозива - " + vydMorozuva +
                        "\nВид добавки - " + dobavka +
                        "\nТип(и) добавки - " + tupyDobavok;
                if (!tupyDobavok.equals("")) {

                }
                JOptionPane.showMessageDialog(null, result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Проста форма");
        frame.setContentPane(new Task3().panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
