public class bai29 extends bai28{
    /// vẽ tam giác cân rỗng
    public void TamGiacCanRong()
    {
        int m = h, n = h;
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= 2 * h - 1; j++)
            {
                if (j == m || j == n || i== h)
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
