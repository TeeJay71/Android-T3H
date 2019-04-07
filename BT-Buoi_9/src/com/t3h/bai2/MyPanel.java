package com.t3h.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbSoKTra;
    private JLabel lbKhoangN;
    private JTextField tfSoKTra;
    private JTextField tfKhoangN;
    private JButton btnKTra;
    private JButton btnLietKe;

    public MyPanel() {
        setSize(GUI.W_FRAME, GUI.H_FRAME);
        setBackground(Color.cyan);
        setLayout(null);
        initComponents();
    }

    private void initComponents() {
        lbSoKTra = new JLabel();
        lbSoKTra.setText("Số kiểm tra : ");
        lbSoKTra.setBounds(20, 10, 200, 30);
        lbSoKTra.setForeground(Color.red);
        lbSoKTra.setFont(new Font(null, Font.BOLD, 20));
        add(lbSoKTra);

        lbKhoangN = new JLabel();
        lbKhoangN.setText("Khoảng N: ");
        lbKhoangN.setBounds(20, 60, 200, 30);
        lbKhoangN.setForeground(Color.DARK_GRAY);
        lbKhoangN.setFont(new Font(null, Font.BOLD, 20));
        add(lbKhoangN);

        tfSoKTra = new JTextField();
        tfSoKTra.setBounds(150, 10, 200, 30);
        add(tfSoKTra);

        tfKhoangN = new JTextField();
        tfKhoangN.setBounds(150, 60, 200, 30);
        add(tfKhoangN);

        btnKTra = new JButton();
        btnKTra.setText("Kiểm tra");
        btnKTra.setBounds(370, 10, 100, 30);
        btnKTra.addActionListener(this);
        add(btnKTra);

        btnLietKe = new JButton();
        btnLietKe.setText("Liệt kê");
        btnLietKe.setBounds(370, 60, 100, 30);
        btnLietKe.addActionListener(this::actionPerformed2);
        add(btnLietKe);
    }

    private void actionPerformed2(ActionEvent event) {
        MyPrime prime = new MyPrime();
        String strN = tfKhoangN.getText();
        if(strN.equals("")){
            JOptionPane.showMessageDialog(null,"Ko có dữ liệu","ERROR",JOptionPane.OK_OPTION);
        }else{
            try{
                int n = Integer.parseInt(strN);
                JOptionPane.showMessageDialog(null,prime.lietKeSNT(n),"Liet ke",JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Dữ liệu ko phù hợp","ERROR",JOptionPane.OK_OPTION);
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        MyPrime prime = new MyPrime();
        String soKTra = tfSoKTra.getText();
        if (soKTra.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Bạn chưa nhập dữ liệu!!", "ERROR", JOptionPane.OK_OPTION);
        } else {
            try {
                int check = Integer.parseInt(soKTra);
                if (prime.kTraSNT(check)==true){
                    JOptionPane.showMessageDialog(null,"Số "+check+" là số nguyên tố",
                            "True",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null,"Số "+check+ " ko phải số nguyên tố",
                            "False",JOptionPane.OK_OPTION);
                }
            } catch (Exception err) {
                err.printStackTrace();
                JOptionPane.showMessageDialog(null, "Bạn phải nhập vào số nguyên dương",
                        "ERROR", JOptionPane.OK_OPTION);
            }
        }
    }
}
