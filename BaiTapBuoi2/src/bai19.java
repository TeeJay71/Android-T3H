public class bai19 extends baitap{
    /// kiểm tra số nguyên dương
    public void ktraSoNguyenTo(){
        int dem = 0;
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                dem = dem + 1;
            }
        }
        if (dem == 2){
            System.out.print("N la so nguyen to");
        } else {
            System.out.print("N deo phai la so nguyen to");
        }
    }

}
