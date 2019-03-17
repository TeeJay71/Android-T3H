import java.util.Scanner;

public class bai13 {

    ///S=x^2+x^4+...+x^2n
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
        double a =1;
        for (int i=1;i<=n;i++){
            a=a*x*x;
            s=s+a;
        }System.out.print("S = "+s);
    }
}
