package com.t3h.student;

public class Main {
    public static void main(String[] args) {
        StudentManager st = new StudentManager();
        st.add(new Student(1,"Tet$uJa",9.0f));
        st.add(new Student(2,"Van Le A",7.5f));
        st.add(new Student(3, "Tran Van B",5.8f));
        st.add(new Student(4,"Nguyen Thi C",6.9f));
        st.add(new Student(5,"Le Van D",4.3f));
        st.printList();
        st.findStudentByScore(4.0f);
    }
}
