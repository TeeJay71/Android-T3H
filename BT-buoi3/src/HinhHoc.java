public class HinhHoc {
    String tenHinh;
    double S,C;
    void nhap(String tenHinh){
        this.tenHinh=tenHinh;
    }
    void tinhDienTich(){
        System.out.println("Dien tich cua "+tenHinh+" = "+S);
    }
    void tinhChuVi(){
        System.out.println("Chu vi cua "+tenHinh+" = "+C);
    }
}
