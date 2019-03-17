import java.util.Scanner;

public class bai12 {
    /// S= x+x^2+x^3+...+x^n
    int x,n;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        this.n=sc.nextInt();
        System.out.println("Nhap x :");
        this.x=sc.nextInt();
    }
    public void tinhS(){
        double s =0;
        long tich =1;
        for (int i=1;i<=n;i++){
            tich = tich*x;
            s=s+tich;
        }System.out.println("S = "+s);
    }
}
