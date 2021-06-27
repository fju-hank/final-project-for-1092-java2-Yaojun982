package com.fju;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.text.NumberFormat;

public class SizeApp {
    private JPanel JPanel0;
    private JButton button1;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel4;
    private JPanel JPanel1;


    public SizeApp() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object options[] = {"OK", "NO"};
                JOptionPane.showOptionDialog(null, "您的尺寸大小" + "\n" + "胸圍 : " + textField1.getText() + "\n" + "腰圍 : " + textField2.getText() + "\n" + "身高 : " + textField3.getText() + "\n" + "Size and Money", "SizeApp", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                JFormattedTextField intField = new JFormattedTextField(NumberFormat.getIntegerInstance());
                intField.setFocusLostBehavior(JFormattedTextField.COMMIT);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SizeApp");
        frame.setContentPane(new SizeApp().JPanel0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public JComponent $$$getRootComponent$$$() {

        return JPanel0;
    }

    private void createUIComponents() {

    }
}





