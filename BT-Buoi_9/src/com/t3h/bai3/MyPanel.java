package com.t3h.bai3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTimKiem;
    private JLabel lbHoTen;
    private JLabel lbLop;
    private JLabel lbDiemTK;
    private JTextField tfTimKiem;
    private JTextField tfHoTen;
    private JTextField tfLop;
    private JTextField tfDiemTK;
    private JButton btnTimKiem;
    private JButton btnNhapTT;

    public MyPanel(){
        setSize(GUI.W_FRAME,GUI.H_FRAME);
        setBackground(Color.white);
        setLayout(null);
        initComponents();
    }

    private void initComponents() {
        lbTimKiem = new JLabel();
        lbTimKiem.setText("Nhập tên học sinh: ");
        lbTimKiem.setBounds(10,10,200,30);
        lbTimKiem.setForeground(Color.red);
        lbTimKiem.setFont(new Font(null,Font.BOLD,20));
        add(lbTimKiem);

        lbHoTen = new JLabel();
        lbHoTen.setText("Họ tên: ");
        lbHoTen.setBounds(20,50,100,30);
        lbHoTen.setForeground(Color.BLACK);
        lbHoTen.setFont(new Font(null,Font.ITALIC,20));
        add(lbHoTen);

        lbLop = new JLabel();
        lbLop.setText("Lớp : ");
        lbLop.setBounds(20,90,100,30);
        lbLop.setForeground(Color.BLACK);
        lbLop.setFont(new Font(null,Font.ITALIC,20));
        add(lbLop);

        lbDiemTK = new JLabel();
        lbDiemTK.setText("Điểm TK : ");
        lbDiemTK.setBounds(20,130,100,30);
        lbDiemTK.setForeground(Color.BLACK);
        lbDiemTK.setFont(new Font(null,Font.ITALIC,20));
        add(lbDiemTK);

        tfTimKiem = new JTextField();
        tfTimKiem.setBounds(220,10,200,30);
        add(tfTimKiem);

        tfHoTen =new JTextField();
        tfHoTen.setBounds(130,50,200,30);
        add(tfHoTen);

        tfLop = new JTextField();
        tfLop.setBounds(130,90,200,30);
        add(tfLop);

        tfDiemTK = new JTextField();
        tfDiemTK.setBounds(130,130,200,30);
        add(tfDiemTK);

        btnTimKiem = new JButton();
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setBounds(430,10,100, 30);
        btnTimKiem.addActionListener(this::actionPerformed2);
        add(btnTimKiem);

        btnNhapTT = new JButton();
        btnNhapTT.setText("Nhập tt học sinh");
        btnNhapTT.setBounds(130,180,200, 30);
        btnNhapTT.addActionListener(this);
        add(btnNhapTT);
    }

    private void actionPerformed2(ActionEvent event) {
        String hoTen = tfTimKiem.getText();
        HocSinh hocSinh =new HocSinh();
        hocSinh.inThongTin(hoTen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String hoTen = tfHoTen.getText();
        String lop = tfLop.getText();
        String diemTK = tfDiemTK.getText();
        try{
            float diem = Float.parseFloat(diemTK);
            HocSinh hocSinh = new HocSinh(hoTen,lop,diem);
            hocSinh.nhapThongTin(hoTen,lop,diem);
            JOptionPane.showMessageDialog(null,"Thêm thành công !!","Thành công ",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception err){
            err.printStackTrace();
            JOptionPane.showMessageDialog(null,"Bạn phải nhập điểm !!!","ERROR",JOptionPane.OK_OPTION);
        }
    }
}
