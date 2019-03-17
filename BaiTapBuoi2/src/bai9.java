public class bai9 extends  baitap{
    ///s=1*2*3*...*n   (n>6)
    public void tinhS(){
        float s=1;
        if(n>6){
            for (float i=1;i<=n;i++)
                s=s*i;
            System.out.println("S= "+s);
        }else System.out.println("Nhap sai roi!!! yeu cau bai toan la n>6");
    }
}
