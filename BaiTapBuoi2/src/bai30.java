public class bai30 extends bai28{
    ///vẽ tam giác vuông cân đặc
    public void TamGiacVuongCanDac()
    {
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
