package hinhhoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    
    //Constructor
    public HinhTron()
    {
        ten = "Hinh tron";
    }

    public void nhapBanKinh()
    {
        System.out.print("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }

    public void tinhChuVi()
    {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich()
    {
        dienTich = PI * banKinh * banKinh;
    }
}