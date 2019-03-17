import java.util.Scanner;

public class bai23 {
    // giải phương trình ax+b=0
    Scanner sc =new Scanner(System.in);
    int a,b;
    public void nhap(){
        System.out.println("Nhap a: ");
        this.a=sc.nextInt();
        System.out.print("Nhap b: ");
        this.b=sc.nextInt();
    }
    public void giaiBaiToan(){
        if(a==0) {
            if (b == 0) System.out.print("Phuong trinh vo so nghiem");
            else System.out.print("Phuong trinh vo nghiem");
        }
        else {
            float x =(float)-b/a;
            System.out.print("Phuong trinh co nghiem duy nhat : "+x);
        }
    }
}
