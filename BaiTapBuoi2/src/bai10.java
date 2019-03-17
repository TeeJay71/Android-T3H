import java.util.Scanner;

public class bai10 {
    ////T =x^n
    int x,n;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap n :");
        this.n=sc.nextInt();
        System.out.println("Nhap x: ");
        this.x=sc.nextInt();
    }
    public void tinhT(){
        float t=1;
        for(int i=1;i<=n;i++)
            t=t*x;
        System.out.println("T = "+t);
    }
}
