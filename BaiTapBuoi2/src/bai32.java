import java.util.Scanner;

public class bai32 {
    ///vẽ hình chữ nhật đặc
    Scanner sc=new Scanner(System.in);
    int m,n;
    public void nhapKichThuoc(){
        System.out.println("Moi nhap kich thuoc cua hinh chu nhat, m=");
        this.m=sc.nextInt();
        System.out.println("n=");
        this.n=sc.nextInt();
    }
    public void ChuNhatDac()
    {
        for (int i = 1; i <= m; ++i)
        {
            for (int j = 1; j <= n; ++j)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
