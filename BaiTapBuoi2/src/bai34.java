import java.util.Scanner;

public class bai34{
    ///nhập điểm toán, lý , hóa , mã học sinh   , tên học sinh . tính điểm trung bình  và xếp loại học sinh
    Scanner sc=new Scanner(System.in);
    float dToan,dLy,dHoa,maHS;
    String tenHS;
    public void nhapThongTinHS(){
        System.out.println("Ho ten hoc sinh :");
        this.tenHS=sc.nextLine();
        System.out.println("Ma hoc sinh :");
        this.maHS=sc.nextInt();
        System.out.println("Nhap diem toan :");
        this.dToan=sc.nextFloat();
        System.out.println("Nhap diem ly :");
        this.dLy=sc.nextFloat();
        System.out.println("Nhap diem hoa :");
        this.dHoa=sc.nextFloat();
    }
    public void xepLoai(){
        float dTrungBinh=(dHoa+dLy+dToan)/3;
        System.out.println("Diem trung binh = "+dTrungBinh);
        if(dTrungBinh>=8.0) {
            System.out.println("Ban "+tenHS+" la hoc sinh gioi");
        }else if((dTrungBinh>=6.5)&&(dTrungBinh<8.0)){
            System.out.println("Ban "+tenHS+" la hoc sinh kha");
        }else if ((dTrungBinh>=4)&&(dTrungBinh<6.5)){
            System.out.println("Ban "+ tenHS+ " la hoc sinh trung binh");
        }else System.out.println("Ban "+tenHS+ " la hoc sinh yeu");
    }
}
