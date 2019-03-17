import java.util.Scanner;

public class bai21 {
    ///NHẬP  N VÀ M TÌM ƯỚC CHUNG LỚN NHẤT
    Scanner sc =new Scanner(System.in);
    int n,m;
    public void nhap(){
        System.out.println("Nhap n: ");
        this.n=sc.nextInt();
        System.out.print("Nhap m: ");
        this.m=sc.nextInt();
    }

    public static int UCLN(int n,int m){
        if(m==0) return n;
        return UCLN(m,n%m);
    }
    public  void print(){
        System.out.println("USCLN của " + n + " và " + m
                + " là: " + UCLN(n, m));

    }
}
