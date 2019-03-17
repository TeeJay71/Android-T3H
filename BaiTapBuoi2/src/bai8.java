public class bai8 extends baitap{
    ///s=1/2+3/4+...+(2n+1)/(2n+2)  (n>5)
    public void tinhS(){
        float s=0;
        if(n>5){
            for (float i=1;i<=n;i++)
                s=s+(2*i+1)/(2*i+2);
            System.out.println("S= "+s);
        }
        else System.out.println("Sai roi ban oi!! yeu cau bai toan la n>5");
    }
}
