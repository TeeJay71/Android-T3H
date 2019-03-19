package com.t3h.student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> arrS = new ArrayList<>();

    public void add(Student student){arrS.add(student);}

    public void findStudentByScore(float score){
        for (Student s:arrS) {
            if (s.getScore()==score){
                s.toString();
            }
        }
    }

    public void printList(){
        for (Student s:arrS) {
            s.toString();
        }
        System.out.println("=========================");
    }
}
