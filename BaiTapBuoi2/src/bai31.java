public class bai31  extends bai28{
    ///tam giác vuông cân rỗng có độ cao là h
    public void TamGiacVuongCanRong()
    {
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i || i == h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
