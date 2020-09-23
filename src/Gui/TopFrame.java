package Gui;

import javax.swing.*;

public class TopFrame implements Interface{
    TopFrame(){

        frame.add(panel/*, BorderLayout.CENTER*/);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login page");
        frame.pack(); //match a size?
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());//change icon of frame
//        frame.getContentPane().setBackground(new Color(123,50,250));//background of application //not working

        frame.setSize(350, 200);
//        frame.setSize(700,300);

    }
}
