public class XeTangTa extends XeTang{
    int soMang;
    void nhap(String dan,String tenXe,double tocDo,int soMang){
        super.nhap(dan,tenXe,tocDo);
        this.soMang=soMang;
    }
    void diChuyen(){
        super.diChuyen();
    }
    void ban(){
        super.ban();
    }
    void baoVeBot(){
        if (soMang==0)
            System.out.println("Game over");
    }
    void kiemTraTrungDan(){
        super.kiemTraTrungDan();
    }

}
