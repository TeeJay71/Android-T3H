package com.t3h.bai4;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.ArrayList;

public class LoginMgr {
    ArrayList<Account> arrAcc = new ArrayList<>();

    public LoginMgr() {
        getAllAccount();
    }

    public void getAllAccount(){
        try{
            File f = new File("D:/Account.txt");
            if(f.exists()==false){
                JOptionPane.showMessageDialog(null,"File chưa được tạo ","NULL",JOptionPane.OK_OPTION);
            }
            FileInputStream in = new FileInputStream(f);
            ArrayList<String> strings= (ArrayList<String>) Files.readAllLines(f.toPath());
            for(String s:strings){
                String user = s.substring(s.indexOf("Username:")+dem("Username:"),s.indexOf("/n"));
                String pass = s.substring(s.indexOf("Password:")+dem("Password:"),s.indexOf("/n"));
                arrAcc.add(new Account(user,pass));
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean login(String user,String pass){
        for (Account a:arrAcc) {
            if (a.getUserName().equals(user)&&a.getPassword().equals(pass))
                return true;
        }
        return false;
    }
    public int dem(String str){
        return str.length();
    }
}
