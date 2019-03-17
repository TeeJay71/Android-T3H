package com.t3h.mangdong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MangDong {
    private ArrayList<Integer> arr = new ArrayList<>();

    public void inMang() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }
        System.out.println();
    }

    public void add(Integer value) {
        arr.add(value);
    }

    public void add(int index, Integer value) {
        arr.add(index, value);
    }

    public void addAll(ArrayList<Integer> arr) {
        this.arr.addAll(arr);
    }

    public void addAll(int index, ArrayList<Integer> arr) {
        this.arr.addAll(index, arr);
    }

    public void set(int index, Integer value) {
        arr.set(index, value);
    }

    public void remove(int index){
        arr.remove(index);
    }

    public void clear(){
        arr.clear();
    }

    public boolean contains(Integer value ){
        return arr.contains(value);
    }

    public boolean containsAll(ArrayList<Integer> arr){
        return this.arr.containsAll(arr);
    }

    public void sort(){
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return -1;
                }
                return 0;
            }
        });
    }

    public void shuff(){
        Collections.shuffle(arr);
    }
}
