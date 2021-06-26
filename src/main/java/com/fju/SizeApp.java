package com.fju;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SizeApp {
    private JPanel JPanel0;
    private JButton button1;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel4;
    private JPanel JPanel5;
    private JPanel JPanel6;
    private JPanel JPanel1;




    public static void main(String[] args) {
        JFrame frame = new JFrame("SizeApp");
        frame.setContentPane(new SizeApp().JPanel0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




}
