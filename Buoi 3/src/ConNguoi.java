public class ConNguoi {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String diaChi;

    void nhap(String ten,int tuoi, boolean gioiTinh,String diaChi){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
        this.diaChi=diaChi;
    }

    void inThongTin(){
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Gioi tinh: "+(gioiTinh ? "Nam ": "Nu"));
        System.out.println("Dia chi: "+diaChi);
    }
}
