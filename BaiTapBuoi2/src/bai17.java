public class bai17 extends baitap{
    //// tính tổng và tích tất cả các ước số của số nguyên dương n
    public void tongVaTich(){
        long tong = 0;
        long tich = 1;
        if(n>0){
            for(int i=1;i<=n;i++)
                if(n%i==0) {
                    tong = tong +i;
                    tich = tich*i;
                }
        }else System.out.println("n ko phai so nguyen duong");
    }

}
