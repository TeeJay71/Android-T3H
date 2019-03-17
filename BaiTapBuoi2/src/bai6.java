public class bai6 extends baitap{
    //// S=1/(1*2)+1/(2*3)+...+1/n*(n+1)   (n>6)


    public void tinhS(){
        double s = 0;
        if(n>6){
            for(int i=1;i<=n;i++)
                s=s+1.0/(i*(i+1));
            System.out.println(" S = "+s);
        }else System.out.println("Yeu cau bai toan la n>6");
    }
}
