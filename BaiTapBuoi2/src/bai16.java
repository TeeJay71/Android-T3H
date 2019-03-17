public class bai16 extends baitap{
    ////liệt kê các ước số của số nguyên dương n
    public void timUocSo(){
        if(n>0){
            for(int i=1;i<=n;i++)
                if(n%i==0) System.out.print(" " +i );
        }else System.out.println("n ko phai so nguyen duong");
    }
}
