public class HocSinh extends ConNguoi{
    float diem;
    String lop;

    /**
     * initial information for Student
     * @param diaChi the student's address
     * @param diem the student's score
     * @return
     *
     *
     * */
    void nhap(String ten, int tuoi,boolean gioiTinh,String diaChi,
              float diem,String lop){
        super.nhap(ten,tuoi,gioiTinh,diaChi);
        this.diem=diem;
        this.lop=lop;
    }
    void hoc(){
        System.out.println("Hoc kien thuc");
    }
    void lamBai(){
        System.out.println("Lam bai tap ve nha");
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: "+diem);
        System.out.println("Lop: "+lop);
    }
}
