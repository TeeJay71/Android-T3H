import java.util.Scanner;

public class bai2 extends baitap{
    // tính S = 1^2+2^2+3^2+...+n^2 (5<=n<=20)

    Scanner sc = new Scanner(System.in);

    public void tinhTongBF(){
        int tong=0;
        if((5<=n)&&(n<=20)){
            for (int i=1;i<=n;i++){
                tong =tong+i*i;
            }
            System.out.println("Tong binh phuong bang = "+tong);
        }
        else System.out.println("Nhap sai yeu cau bai toan 5<=n<=20");
    }
}
