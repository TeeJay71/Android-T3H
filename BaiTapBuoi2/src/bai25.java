import java.util.Scanner;

public class bai25 {
    /// nhập vào 1 năm ktra xem năm đó có phải năm nhuận ko
    Scanner sc = new Scanner(System.in);
    int year;
    public void nhapNam(){
        System.out.println("Moi nhap nam can kiem tra");
        this.year=sc.nextInt();
    }
    public  void kTraNamNhuan(){
        if(year % 4==0){
            if(year%100==0) {
                if (year % 400 == 0) System.out.println("Nam " + year + " la nam nhuan");
                else System.out.println("Nam " + year + " khong phai la nam nhuan");
            }else System.out.println("Nam "+year+" la nam nhuan");
        }else System.out.println("Nam "+year+" khong phai la nam nhuan");
    }
}
