package com.t3h.usermanager;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private int age;
    private String job;

    public User(String userName, String password, String name, String dateOfBirth, int age, String job) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void showInFor(){
        System.out.println("Name: "+name);
        System.out.println("UserName: "+userName);
        System.out.println("PassWord: "+password);
        System.out.println("Date Of Birth: "+ dateOfBirth);
        System.out.println("Age: "+age);
        System.out.println("Job: "+job);
    }

    public void changePassword(String password){
        if(this.password==password){
            System.out.println("Password ko hop le");
        }else this.password=password;
    }

}
