import java.util.Scanner;

public class bai28{
    //viết ctrinh in ra hình tam giác cân đặc có độ cao là h
    Scanner sc=new Scanner(System.in);
    int h;
    public void nhapH(){
        System.out.println("Moi nhap chieu cao cua tam giac, h=");
        this.h=sc.nextInt();
    }
    public void TamGiacCanDac()
    {
        int m = h, n = h;
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= 2 * h - 1; j++)
            {
                if (j >= m && j <= n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            m--;
            n++;
            System.out.print("\n");
        }
    }
}
