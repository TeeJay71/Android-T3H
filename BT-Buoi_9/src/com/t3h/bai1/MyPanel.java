package com.t3h.bai1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JLabel lbNhapA;
    private JLabel lbNhapB;
    private JLabel lbNhapC;
    private JLabel lbKetQua;
    private JLabel lbX1X2;
    private JTextField tfNhapA;
    private JTextField tfNhapB;
    private JTextField tfNhapC;
    private JButton btnGiaiBT;

    public MyPanel(){
        setSize(GUI.W_FRAME,GUI.H_FRAME);
        setBackground(Color.white);
        setLayout(null);
        initComponents();
    }

    private void initComponents() {
        lbTitle = new JLabel();
        lbTitle.setText("Giai PT Bac 2");
        lbTitle.setBounds(25,0, GUI.W_FRAME-50,100);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.red);
        lbTitle.setFont(new Font(null,Font.BOLD,20));
        add(lbTitle);

        lbNhapA = new JLabel();
        lbNhapA.setText("Nhap A : ");
        lbNhapA.setBounds(50,80,80,30);
        lbNhapA.setForeground(Color.BLACK);
        lbNhapA.setFont(new Font(null,Font.BOLD,18));
        add(lbNhapA);

        lbNhapB = new JLabel();
        lbNhapB.setText("Nhap B : ");
        lbNhapB.setBounds(50,120,80,30);
        lbNhapB.setForeground(Color.BLACK);
        lbNhapB.setFont(new Font(null,Font.BOLD,18));
        add(lbNhapB);

        lbNhapC = new JLabel();
        lbNhapC.setText("Nhap C : ");
        lbNhapC.setBounds(50,160,80,30);
        lbNhapC.setForeground(Color.BLACK);
        lbNhapC.setFont(new Font(null,Font.BOLD,18));
        add(lbNhapC);

        tfNhapA = new JTextField();
        tfNhapA.setBounds(140,80,200,30);
        add(tfNhapA);

        tfNhapB = new JTextField();
        tfNhapB.setBounds(140,120,200,30);
        add(tfNhapB);

        tfNhapC=new JTextField();
        tfNhapC.setBounds(140,160,200,30);
        add(tfNhapC);

        lbKetQua = new JLabel();
        lbKetQua.setText("Ket qua: ");
        lbKetQua.setBounds( 50,200,150,30);
        lbKetQua.setForeground(Color.red);
        lbKetQua.setFont(new Font(null,Font.BOLD,20));
        add(lbKetQua);

        lbX1X2 = new JLabel();
        lbX1X2.setBounds(150,200,200,30);
        lbX1X2.setFont(new Font(null,Font.ITALIC,16));
        add(lbX1X2);

        btnGiaiBT = new JButton();
        btnGiaiBT.setText("Giai PT Bac 2");
        btnGiaiBT.setBounds(100,240,200,30);
        btnGiaiBT.addActionListener(this);
        add(btnGiaiBT);



    }



    public void actionPerformed(ActionEvent event){
        MyPanel panel = new MyPanel();
        float a = Float.parseFloat(tfNhapA.getText());
        float b = Float.parseFloat(tfNhapB.getText());
        float c = Float.parseFloat(tfNhapC.getText());
        PTBac2 ptBac2 = new PTBac2(a,b,c);
        if (event.getSource().equals(btnGiaiBT)){
            JOptionPane.showMessageDialog(null,ptBac2.GiaiPT(a,b,c));

        }
    }

}
