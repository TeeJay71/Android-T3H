public class bai5 extends baitap{
        /// tính S= 1+1/3+1/5+..+1/(2n+1)    (n>=2)
    public void tinhS(){
        double s=1;
        if (n>=2){
            for(int i=1;i<=n;i++)
                s=s+1.0/(2*i+1);
            System.out.println("S="+s);
        }else System.out.println("Yeu cau bai toan la n>=2");
    }
}
