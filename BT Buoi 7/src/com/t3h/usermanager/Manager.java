package com.t3h.usermanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<User> arrayUser = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Manager() {
    }

    public int check(String userName) {
        for (User u : arrayUser) {
            if (u.getUserName().equals(userName)) {
                return 1;
            }
        }
        return -1;
    }

    public int checkLogIn(String user, String pass) {
        for (User u : arrayUser) {
            if ((u.getUserName().equals(user)) && u.getPassword().equals(pass)) {
                return 1;

            }
        }
        return -1;
    }

    public void signUp(User u) {
        int exists = check(u.getUserName());
        if (exists == -1) {
            arrayUser.add(u);
            System.out.println("Dang ky thanh cong");
        } else System.out.println("Dang ky that bai");
    }

    public void logIn() {
        System.out.println("User name: ");
        String user = sc.nextLine();
        int exists;
        for (int i = 0; i < arrayUser.size(); i++) {
            if (arrayUser.get(i).getUserName().equals(user)) {
                System.out.println("Password: ");
                String pass = sc.nextLine();
                exists = checkLogIn(user, pass);
                if (exists == 1) {
                    System.out.println("Dang nhap thanh cong");
                    System.out.println("Vi tri user: "+i);
                } else System.out.println("Tai khoan hoac mat khau ko dung");
            }
        }
    }

    public void changePass(String user) {
        int exists;
        for (int i = 0; i < arrayUser.size(); i++) {
            if (arrayUser.get(i).getUserName().equals(user)){
                System.out.println("Nhap mat khau hien tai");
                String pass = sc.nextLine();
                exists = checkLogIn(user, pass);
                if (exists == 1) {
                    System.out.println("Moi nhap mat khau moi: ");
                    String passnew = sc.nextLine();
                    arrayUser.get(i).changePassword(passnew);
                    System.out.println("Doi mat khau thanh cong");
                } else {
                    System.out.println("Sai mat khau !!!");
                }
            }
        }
    }

    public void deleteUser(String user) {
        int exists;
        for (int i = 0; i < arrayUser.size(); i++) {
            if (arrayUser.get(i).getUserName() == user) {
                System.out.println("Password");
                String pass = sc.nextLine();
                exists = checkLogIn(user, pass);
                if (exists == 1) {
                    arrayUser.remove(i);
                    System.out.println("Xoa thanh cong");
                } else {
                    System.out.println("Dang nhap that bai");
                }
            }
        }
    }

    public void findUser(String name){
        for(int i=0;i<arrayUser.size();i++){
            if(arrayUser.get(i).getName().equals(name)){
                arrayUser.get(i).showInFor();
            }
        }
    }

    public void showInfo(String user){
        for(int i=0;i<arrayUser.size();i++){
            if(arrayUser.get(i).getUserName().equals(user)){
                arrayUser.get(i).showInFor();
            }
        }
    }
}
