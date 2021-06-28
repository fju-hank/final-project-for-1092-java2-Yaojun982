package com.fju;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.NumberFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;





public class SizeApp {
    private JPanel JPanel0;
    private JButton button1;
    private JButton shoppingButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel4;
    private JPanel JPanel1;
    private JButton compareYourSizeButton;
    private JTextArea textArea1;


    public SizeApp() {
        button1.addActionListener(new ActionListener() {




            @Override
            public void actionPerformed(ActionEvent e) {
                Object options[] = {"OK"};
                JOptionPane.showOptionDialog(null, "您的尺寸大小" + "\n" + "胸圍 : " + textField1.getText() + "\n" + "腰圍 : " + textField2.getText() + "\n" + "身高 : " + textField3.getText() + "\n"
                        + "Size and Money", "SizeApp", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);





                JFormattedTextField intField = new JFormattedTextField(NumberFormat.getIntegerInstance());
                intField.setFocusLostBehavior(JFormattedTextField.COMMIT);

            }
        });
        shoppingButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */

                @Override
                public void actionPerformed(ActionEvent e) {                                              //opendata
                    try {
                        Desktop.getDesktop().browse(new URI("https://cloud.hakka.gov.tw/Pub/Opendata/DTST20161300102.json"));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (URISyntaxException uriSyntaxException) {
                        uriSyntaxException.printStackTrace();
                    }

                }

        });
        compareYourSizeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {             //.txt

                try {

                    FileReader reader = new FileReader("衣服尺寸量法.txt");


                    char[] buffer = new char[1024];

                    StringBuffer result = new StringBuffer();

                    int len;

                    while((len = reader.read(buffer)) != -1) {
                        result.append(buffer,0,len);
                    }

                    reader.close();

                    //更新文本顯示區內容
                    textArea1.setText(result.toString());

                    System.out.println("讀檔成功");
                }  catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

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





