package com.t3h.bai2;

public class MyPrime {
    public int soKTra;
    public int n;

    public MyPrime() {
    }
    public boolean kTraSNT(int soKTra){
        if(soKTra<2){
            return false;
        }
        int sqrt = (int)Math.sqrt(soKTra);
        for (int i =2;i<=sqrt;i++){
            if(soKTra%i==0){
                return false;
            }
        }
        return true;
    }

    public String lietKeSNT(int n){
        String str=" ";
        for (int i=0;i<=n;i++){
            if(kTraSNT(i)){
                str = str +i+",";
            }
        }
        return str;
    }


}
