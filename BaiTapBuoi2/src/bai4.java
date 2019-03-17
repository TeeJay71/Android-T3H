import java.util.Scanner;

public class bai4 extends baitap{
    ///tính S= 1+1/2+1/4+..+1/(2n)     (n>=9)
    Scanner sc=new Scanner(System.in);
    public void tinhS(){
        double S=0;
        if(n>=9) {
            for (int i = 1; i <= n; i++)
                S = S + 1.0 / (2 * i);
            System.out.println("S =" + S);
        }else System.out.println("Sai yeu cau n>=9");

    }


}
