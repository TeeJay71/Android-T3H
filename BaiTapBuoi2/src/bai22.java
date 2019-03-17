public class bai22 extends  bai21{
    ////tìm bội chung nhỏ nhất
    public static int BCNN(int n, int m) {
        return (n * m) / UCLN(n, m);
    }
    public  void printBCNN(){
        System.out.println("Boi chung nho nhat của " + n + " và " + m
                + " là: " + BCNN(n, m));

    }
}
