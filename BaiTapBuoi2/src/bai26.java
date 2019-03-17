public class bai26 extends baitap{
    //liệt kê các số nguyên lẻ nhỏ hơn n (n>0)
    public void lietKeSoLe(){
        if(n>0){
            for (int i =1;i<=n;i++)
                if(i%2!=0) System.out.println(" "+i);
        }
    }
}
