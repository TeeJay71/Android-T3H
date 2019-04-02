package com.t3h.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitel ;
    private JTextField tfInput;
    private JButton btnOk;

    public MyPanel(){
        setBackground(Color.BLUE);
        setLayout(null);
        initComponents();
    }

    private void initComponents() {
        lbTitel = new JLabel();
        lbTitel.setText("Hello world");
        lbTitel.setForeground(Color.white);
        lbTitel.setFont(new Font("Times new roman",Font.BOLD,20));
        lbTitel.setBounds(0,0,MyFrame.W_FRAME,100);
        lbTitel.setHorizontalAlignment(SwingConstants.CENTER); //căn giữa chiều ngang
        add(lbTitel);

        tfInput = new JTextField();
        tfInput.setFont(new Font("Champagne & Limousines",Font.ITALIC,20));
        tfInput.setBounds(20,110,200,30);
        add(tfInput);

        btnOk = new JButton();
        btnOk.setText("OK");
        btnOk.setBounds(20,150,200,30);
        btnOk.addActionListener(this);
        add(btnOk);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = tfInput.getText();
        JOptionPane.showMessageDialog(
                null,value,"Clicked!!",JOptionPane.INFORMATION_MESSAGE
        );
    }
}
