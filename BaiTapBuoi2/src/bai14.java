import java.util.Scanner;

public class bai14 {
    ///S =x+x^3+...+x^(2n+1)
    int x,n;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n=sc.nextInt();
        System.out.print("Nhap x :");
        this.x=sc.nextInt();
    }
    public void tinhS(){
        double s=0;
        double a;
        for (int i=0;i<=n;i++){
            a =Math.pow(x,(2*i+1));
            s=s+a;
        }System.out.print("S = "+s);
    }

}
