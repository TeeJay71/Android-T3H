package com.t3h.bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbUserName;
    private JLabel lbPassword;
    private JTextField tfUserName;
    private JTextField tfPassword;
    private JButton btnLogin;
    private JButton btnCancel;
    private LoginMgr loginMgr;

    public MyPanel(){
        setSize(GUI.W_FRAME,GUI.H_FRAME);
        setBackground(Color.white);
        setLayout(null);
        initComponents();
    }

    private void initComponents() {
        lbUserName = new JLabel();
        lbUserName.setText("User Name : "  );
        lbUserName.setBounds(20,20,150,30);
        lbUserName.setForeground(Color.BLACK);
        lbUserName.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lbUserName);

        lbPassword = new JLabel();
        lbPassword.setText("Password :");
        lbPassword.setBounds(20,60,150,30);
        lbPassword.setForeground(Color.BLACK);
        lbPassword.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lbPassword);

        tfUserName = new JTextField();
        tfUserName.setBounds(170,20,250,30);
        add(tfUserName);

        tfPassword = new JTextField();
        tfPassword.setBounds(170,60,250,30);
        add(tfPassword);

        btnCancel = new JButton();
        btnCancel.setText("Cancel");
        btnCancel.setBounds(90,120,150,30);
        btnCancel.addActionListener(this);
        add(btnCancel);

        btnLogin = new JButton();
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(this);
        btnLogin.setBounds(250,120,150,30);
        add(btnLogin);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LoginMgr loginMgr = new LoginMgr();
        if (e.getSource().equals(btnCancel)){
            System.exit(0);
        }else if(e.getSource().equals(btnLogin)) {
            String user = tfUserName.getText();
            String pass = tfPassword.getText();
            if ((user==null) || (pass==null)) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu trước", "Null", JOptionPane.OK_OPTION);
            } else {
                if (loginMgr.login(user, pass) == true) {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công !!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } else
                    JOptionPane.showMessageDialog(null, "Sai username hoặc password", "Thất bại", JOptionPane.OK_OPTION);
            }
        }
    }
}
