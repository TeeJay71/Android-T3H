public class bai15 extends baitap{
    ////S =n!

    public void tinhGiaiThua(){
        long giaithua = 1;
        if (n == 0 || n == 1) {
            System.out.print("Giai thua cua n = "+giaithua);
        } else {
            for (int i = 2; i <= n; i++) {
                giaithua *= i;
            }
            System.out.print("Giai thua cua n = "+giaithua);
        }

    }
}
