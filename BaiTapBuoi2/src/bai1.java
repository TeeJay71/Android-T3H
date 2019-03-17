import java.util.Scanner;

public class bai1 extends baitap{
    //tinh tong S=1+2+3....+n (3<n<50) n nhap tu ban phim
    Scanner sc = new Scanner(System.in);

    public void tinhTong(){
        int tong =0;
        if ((3<n)&&(n<50)){
            for(int i=1;i<=n;i++)
                tong = tong +i;
            System.out.println("Tong tu 1-> n = "+tong );

        }
        else System.out.println("Nhap sai yeu cau bai toan");

    }

}
