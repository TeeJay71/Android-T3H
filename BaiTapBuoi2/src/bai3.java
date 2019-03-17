import java.util.Scanner;

public class bai3 extends baitap{
    ///tính S= 1+1/2+1/3+...+1/n (n>=7)
    Scanner sc= new Scanner(System.in);
    public void tinhTongThuong(){
        double S=0;
        if(n>=7){
            for(int i=1;i<=n;i++){
                S=S+1.0/i;
            }
            System.out.println("Tong thuong = "+S);
        }
        else System.out.println("Sai yeu cau bai toan n>=7");
    }
}
