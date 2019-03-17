public class bai18 extends baitap{
    ///tính số lượng các ước, các ước số lẻ, các ước số chẵn
    public void tinhSoLuong(){
        int tongUoc=0,uocLe=0,uocChan=0;
        if(n>0){
            for(int i=1;i<=n;i++)
                if(n%i==0){
                    tongUoc=tongUoc+1;
                    if(i%2==0) uocChan++;
                    else uocLe++;
                }
            System.out.println("Tong so uoc = "+tongUoc);
                System.out.println("So uoc chan ="+uocChan);
                System.out.println("So uoc le ="+uocLe);
        }else System.out.println("n ko phai so nguyen duong");
    }
}
