package com.t3h.demo.login;

import com.t3h.demo.BaseFrame;
import com.t3h.demo.BasePanel;
import com.t3h.demo.dashboard.DashboardFrame;
import com.t3h.demo.dashboard.DashboardPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends BasePanel implements ActionListener {
    private JLabel lbTitle;
    private JTextField tfUserName;
    private JTextField tfPassword;
    private JButton btnOk;
    @Override
    protected void initComponents() {
        lbTitle = new JLabel();
        lbTitle.setText("Log In");
        lbTitle.setBounds(0,0, BaseFrame.W_FRAME,100);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.red);
        lbTitle.setFont(new Font(null,Font.BOLD,20));
        add(lbTitle);

        tfUserName = new JTextField();
        tfUserName.setBounds(20,120,BaseFrame.W_FRAME-40,30);
        add(tfUserName);

        tfPassword = new JTextField();
        tfPassword.setBounds(20,170,BaseFrame.W_FRAME-40,30);
        add(tfPassword);

        btnOk = new JButton();
        btnOk.setText("OK");
        btnOk.setBounds(20,210,BaseFrame.W_FRAME-40,30);
        btnOk.addActionListener(this);
        add(btnOk);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userNameText= tfUserName.getText();
        String passwordText = tfPassword.getText();
        DashboardFrame dashboardFrame = new DashboardFrame();
        dashboardFrame.setText(userNameText,passwordText);
        dashboardFrame.setVisible(true); //close current frame
        SwingUtilities.getWindowAncestor(this).dispose();

    }
}
