public class XeTangDich extends XeTang{
    String loaiXe;
    void nhap(String dan,String tenXe,double tocDo,String loaiXe){
        super.nhap(dan,tenXe,tocDo);
        this.loaiXe=loaiXe;
    }
    void diChuyen(){
        super.diChuyen();
    }
    void ban(){
        super.ban();
    }
    void kiemTraTrungDan(){
        super.kiemTraTrungDan();
    }
}
