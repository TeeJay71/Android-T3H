package com.t3h.mangdong;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MangDong md = new MangDong();
        md.add(10);
        md.add(20);
        md.add(1, 30);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        md.addAll(arr);

        md.set(0, 1000);

        md.remove(4);
        md.inMang();

        boolean check = md.contains(10200);
        System.out.println(check);

        arr.set(1,20);
        check = md.containsAll(arr);
        System.out.println(check);

        md.sort();
        md.inMang();

        md.shuff();
        md.inMang();
    }
}
