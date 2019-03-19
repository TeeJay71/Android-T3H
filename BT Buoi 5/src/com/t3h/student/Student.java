package com.t3h.student;

public class Student {
    private int id;
    private String name;
    private float score;

    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }

    public String toString(){
        System.out.println("ID: "+id+" Ten: "+name+" Diem: "+score);
        return null;
    }
}
