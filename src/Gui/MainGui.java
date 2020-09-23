package Gui;

import javax.swing.*;

public class MainGui extends TopFrame implements Interface {
    protected JLabel userLogin = new JLabel("Logsssssssssin : ");
    protected JTextField userFieldL = new JTextField();//(..)<-20
    protected JLabel userPassword = new JLabel("Passssssssword : ");
    protected JPasswordField userFieldP = new JPasswordField();
    public MainGui(){
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(null/*new GridLayout(2,1)*/);//rows and colums

        userLogin.setBounds(10,20,80,25);
        panel.add(userLogin);
        userFieldL.setBounds(100, 20, 165, 25);
        panel.add(userFieldL);

        userPassword.setBounds(10, 50 ,80 ,25);
        panel.add(userPassword);
        userFieldP.setBounds(100, 50, 165, 25);
        panel.add(userFieldP);

    }
}
