package com.t3h.main;

import com.t3h.butve.MauDo;
import com.t3h.butve.MauVang;
import com.t3h.butve.MauXanh;
import com.t3h.dohoa.HinhChuNhat;
import com.t3h.dohoa.HinhTamGiac;
import com.t3h.dohoa.HinhTron;
import com.t3h.music.Song;
import com.t3h.music.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MauDo mauDo = new MauDo("mau do");
        HinhTron hinhTron = new HinhTron("hinh tron",mauDo);
        hinhTron.ve();

        System.out.println("================================");
        MauXanh mauXanh = new MauXanh("mau xanh");
        HinhChuNhat hinhChuNhat = new HinhChuNhat("hinh chu nhat",mauXanh);
        hinhChuNhat.ve();

        System.out.println("================================");
        MauVang mauVang = new MauVang("mauvang");
        HinhTamGiac hinhTamGiac =new HinhTamGiac("hinh tam giac",mauVang);
        hinhTamGiac.ve();

        System.out.println("====================================");
        Song song = new Song("Đôi bờ","DSK","7.9MB","04:19");
        Video video = new Video("Đời người","Tet$uJa","20MB","03:40","Coder");
        song.play();
        song.pause();
        song.next();
        song.back();
        video.play();
        video.pause();
        video.next();
        video.back();

    }
}
