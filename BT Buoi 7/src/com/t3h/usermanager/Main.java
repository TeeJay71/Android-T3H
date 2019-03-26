package com.t3h.usermanager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.signUp(new User("Tet$uJa", "Tj07011999", "Thai", "26/12/1998", 21, "Student"));
        manager.signUp(new User("ABC", "123", "Nguyen Van A", "01/01/1999", 20, "No job"));
        manager.signUp(new User("XYZ", "456", "Tran Thi B", "10/08/1996", 23, "Coder"));
        manager.logIn();
        manager.changePass("ABC");
        manager.showInfo("ABC");
        manager.deleteUser("XYZ");
        manager.showInfo("XYZ");
        manager.findUser("Thai");
    }
}
