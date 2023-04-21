package hinhhoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    // Contructor
    public HinhTru()
    {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao()
    {
        nhapBanKinh();

        System.out.println("Chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc .nextFloat();
    }

    public void tinhTheTich()
    {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
