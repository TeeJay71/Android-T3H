public class HinhVuong extends  HinhHoc{
    int soCanh=4;
    double kichThuoc,duongCheo;
    void nhap(String tenHinh,double kichThuoc){
        super.tenHinh=tenHinh;
        this.kichThuoc=kichThuoc;
    }
    void tinhDienTich(){
        S=kichThuoc*kichThuoc;
        super.tinhDienTich();
    }
    void tinhChuVi(){
        C=kichThuoc*soCanh;
        super.tinhChuVi();
    }
    void tinhDuongCheo(){
        duongCheo=Math.sqrt(2*kichThuoc*kichThuoc);
        System.out.println("Duong cheo cua hinh vuong = "+duongCheo);
    }
    void tongChieuDaiCacCanh(){
        double tongCDCC=4*kichThuoc+2*duongCheo;
        System.out.println("Tong chieu dai cac canh = "+tongCDCC);
    }
}
