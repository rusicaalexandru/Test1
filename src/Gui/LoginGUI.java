package Gui;

import main.MainApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI extends TopFrame implements ActionListener, Interface {


    protected JLabel userLogin = new JLabel("Login : ");
    protected JTextField userFieldL = new JTextField();//(..)<-20
    protected JLabel userPassword = new JLabel("Password : ");
    protected JPasswordField userFieldP = new JPasswordField();

    protected JButton button = new JButton("Login");
    protected JLabel succes = new JLabel(" ");

    public LoginGUI(){

        // ---------------------- Login/Password/Button -----------------
        userLogin.setBounds(10,20,80,25);
        panel.add(userLogin);
        userFieldL.setBounds(100, 20, 165, 25);
        panel.add(userFieldL);

        userPassword.setBounds(10, 50 ,80 ,25);
        panel.add(userPassword);
        userFieldP.setBounds(100, 50, 165, 25);
        panel.add(userFieldP);

        button.setBounds(10,80,80,25);
        panel.add(button);
        button.addActionListener(this);
        succes.setBounds(10,110, 300,25);
        panel.add(succes);
        // ---------------------- L/P/B -----------------

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(null/*new GridLayout(2,1)*/);//rows and colums

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = this.userFieldL.getText();
        String password = this.userFieldP.getText();

        if (login.equals("Alex") || login.equals("Alexandra") && password.equals("123")){
//            System.out.println(login+", "+password);
            succes.setText("Login Succes!!");
            //
            new MainGui();

        } else {
            succes.setText("Login Failed");
        }
    }

}
/*
private static int count = 0;

    JLabel text1 = new JLabel("Testing lable: 0");
    JButton subminButton = new JButton("Submit");

        panel.add(subminButton);
        panel.add(text1);
                subminButton.addActionListener(this);

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        text1.setText("Testing lable: " + count);
//        if (count == 8) count = 0;
    }
*/
