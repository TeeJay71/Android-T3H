package com.t3h.demo.dashboard;

import com.t3h.demo.BaseFrame;
import com.t3h.demo.BasePanel;
import com.t3h.demo.login.LoginFrame;
import com.t3h.demo.login.LoginPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPanel extends BasePanel implements ActionListener {

    private JLabel lbHello;
    private JLabel lbContent;
    private JButton btnExit;
    private JButton btnBack;



    @Override
    protected void initComponents() {
        lbHello = new JLabel();
        lbHello.setText("Hello !!");
        lbHello.setFont(new Font(null,Font.ITALIC,20));
        lbHello.setBounds(0,0, BaseFrame.W_FRAME,100);
        lbHello.setHorizontalAlignment(SwingConstants.CENTER);
        lbHello.setForeground(Color.BLACK);
        add(lbHello);

        lbContent = new JLabel();
        lbContent.setFont(new Font(null,Font.ITALIC,20));
        lbContent.setBounds(0,110, BaseFrame.W_FRAME,20);
        lbContent.setHorizontalAlignment(SwingConstants.CENTER);
        lbContent.setForeground(Color.red);
        add(lbContent);

        btnBack = new JButton();
        btnBack.setText("Back");
        btnBack.setBounds(75,160,100, 20);
        btnBack.addActionListener(this);
        add(btnBack);

        btnExit = new JButton();
        btnExit.setText("EXIT !!!");
        btnExit.setBounds(225,160,100, 20);
        btnExit.addActionListener(this);
        add(btnExit);

    }

    public void setText(String userName,String password){
        lbContent.setText(userName +","+password);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnBack)){
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
        }else {
            System.exit(0);
        }
    }
}
