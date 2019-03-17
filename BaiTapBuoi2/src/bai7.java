public class bai7  extends baitap{
    /// s=1/2+2/3+...+n/(n+1) (n>=1)

    public void tinhS(){
        float s=0;
        if(n>=1 ){
            for (float i=1;i<=n;i++){
                float a=(i/(i+1));
                s=s+a;}
            System.out.println("S= "+s);
        }
        else
            System.out.println("Sai roi, n phai lon hon hoac bang 1");
    }
}
