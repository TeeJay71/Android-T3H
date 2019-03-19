package com.t3h.danhba;

public class DanhBa{
    private String ten;
    private String soDT;

    public DanhBa(String ten, String soDT) {
        this.ten = ten;
        this.soDT = soDT;
    }

    public String getTen() {
        return ten;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    public void printList(){
        System.out.println(" ten " +ten);
        System.out.println(" sdt" +soDT);

    }
    public String toString(){

        System.out.println("Ten: "+ten+" SDT: "+soDT);
        return null;
    }
}
