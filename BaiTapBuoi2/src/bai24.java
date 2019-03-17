import java.util.Scanner;

public class bai24 {
    //giải phương trình a*x^2+b*x+c=0
    Scanner sc =new Scanner(System.in);
    float a,b,c;
    public void nhap(){
        System.out.println("Nhap he so bac nhat, a= ");
        this.a=sc.nextFloat();
        System.out.println("Nhap he so bac hai, b= ");
        this.b=sc.nextFloat();
        System.out.println("Nhap hang so, c= ");
        this.c=sc.nextFloat();
    }
    public void giatPTbac2(){
        if (a==0){
            if(b==0) System.out.println("Phuong trinh vo nghiem");
            else System.out.println("Phuong trinh co 1 nghiem duy nhat x ="+(-c/b));
            return;
        }
        float del=b*b-4*a*c;
        float x1,x2;
        if (del>0){
            x1=(float)((-b +Math.sqrt(del))/(2*a));
            x2=(float)((-b-Math.sqrt(del))/(2*a));
            System.out.println("Phuong trinh co 2 nghiem x1 ="+x1+" x2 ="+x2);
        }else if(del==0){
            x1=(-b/(2*a));
            System.out.println("Phuong trinh co nghiem kep x1=x2="+x1);
        }else System.out.println("Phuong trinh vo nghiem !!!");
    }
}
