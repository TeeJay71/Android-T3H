public class bai11 extends baitap {
    //// tính s=1+1.2+1.2.3+...+1.2.3....n
    public void tinhS(){
        long s=0;
        int tich=1;
        for( int i=1;i<=n;i++){
            tich = tich*i;
            s =s+tich;
        }
        System.out.println("S = "+s);
    }

}
