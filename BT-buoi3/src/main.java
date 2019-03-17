public class main {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron();
        h1.nhap("Hinh tron",4.0);
        h1.tinhDienTich();
        h1.tinhChuVi();
        h1.tinhSTGVuongCanNoiTiep();

        System.out.println("==========================");

        HinhVuong h2 = new HinhVuong();
        h2.nhap("Hinh vuong",5);
        h2.tinhDienTich();
        h2.tinhChuVi();
        h2.tinhDuongCheo();
        h2.tongChieuDaiCacCanh();


        System.out.println("======================");
        XeTangTa xeTa = new XeTangTa();
        xeTa.nhap("dan1","Xe Tang Ta",7.0,5);
        xeTa.diChuyen();
        xeTa.ban();
        xeTa.kiemTraTrungDan();

        XeTangDich xeDich = new XeTangDich();
        xeDich.nhap("dan1","Xe Tang Dich",7.0,"Xe boss");
        xeDich.diChuyen();
        xeDich.ban();
        xeDich.kiemTraTrungDan();


    }
}
