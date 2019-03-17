public class bai20 extends baitap{
    ///kiểm tra số chính phương
    public void ktraSoChinhPhuong(){
        int t=(int)Math.sqrt(n);
        if(t*t==n)System.out.print("N la so chinh phuong");
        else System.out.print("N ko phai la so chinh phuong");
    }
}
