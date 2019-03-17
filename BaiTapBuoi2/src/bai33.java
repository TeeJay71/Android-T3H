public class bai33 extends bai32{
//    vẽ hình chữ nhật rỗng
public void ChuNhatRong()
{
    for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= n; j++)
            if (i == 1 || j == 1 || i == m || j == n)
                System.out.print("* ");
            else
                System.out.print("  ");
        System.out.print("\n");
    }
}
}
