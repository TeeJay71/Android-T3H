public class HinhTron extends HinhHoc{
    double banKinh;

    void nhap(String tenHinh,double banKinh) {
        super.nhap(tenHinh);
        this.banKinh=banKinh;
    }

    void tinhDienTich(){
        S=banKinh*banKinh*3.14;
        super.tinhDienTich();
    }
    void tinhChuVi(){
        C=banKinh*2*3.14;
        super.tinhChuVi();
    }
    void tinhSTGVuongCanNoiTiep(){
        double S1= banKinh*banKinh;
        System.out.println("Dien tich tam giac vuong can noi tiep duong tron = "+S1);
    }
}
