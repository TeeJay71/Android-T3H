public class NhanVien extends ConNguoi{
    String chucVu;
    int luong;
    void nhap(String ten, int tuoi, boolean gioiTinh,String diaChi,String chucVu,int luong){
        super.nhap(ten,tuoi,gioiTinh,diaChi);
        this.chucVu=chucVu;
        this.luong=luong;
    }
    @Override
    void inThongTin(){
        super.inThongTin();
        System.out.println("Chuc vu:  "+chucVu);
        System.out.println("Luong: "+luong);
    }

    void lamViec(){
        System.out.println("Cuoc song kho khan nen tao work hard/ Ae den roi minh cung xuat phat");
    }


}
