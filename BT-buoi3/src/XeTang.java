import java.util.Random;

public class XeTang {
    String dan;
    String tenXe;
    double tocDo;
    int mau;
    void nhap(String dan,String tenXe ,double tocDo){
        this.dan=dan;
        this.tenXe=tenXe;
        this.tocDo=tocDo;
    }
    void diChuyen(){
        System.out.println(tenXe+" dang di chuyen");
    }
    void ban(){
        System.out.println(tenXe+" ban");
    }
    void kiemTraTrungDan(){
        if (Math.random()%2==0)
            System.out.println("Trung dan");
        else if(Math.random()%2!=0) System.out.println("Xi hut");
    }
}
