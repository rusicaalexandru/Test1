package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {

    private static int count = 0;

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel text1 = new JLabel("Testing lable: 0");
    JButton subminButton = new JButton("Submit");
    JCheckBox malefemaleBox = new JCheckBox();



    public GUI(){
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));//rows and colums
        panel.add(subminButton);
        panel.add(text1);
        panel.add(malefemaleBox);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("IS21Z (find a new name)");
        frame.pack(); //match a size?
        frame.setVisible(true);

        frame.setSize(700,500);

        subminButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        text1.setText("Testing lable: " + count);
//        if (count == 8) count = 0;
    }
}
