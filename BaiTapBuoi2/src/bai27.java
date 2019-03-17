public class bai27 extends baitap{
    /// liệt kê các số lẻ nhỏ hơn n, trừ 7,21, 41
    public void lietKeSoLe(){
        if(n>0){
            for (int i =1;i<=n;i++)
                if((i%2!=0)&&(i!=7)&&(i!=21)&&(i!=41)) System.out.println(" "+i);
        }
    }
}
