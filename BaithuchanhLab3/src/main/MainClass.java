package main;
import hinhhoc.HinhChuNhat;
import hinhhoc.HinhTron;
import hinhhoc.HinhTru;
import hinhhoc.HinhVuong;

public class MainClass {
    public static void main(String[] args){
        // Hinh tron
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        //hinh tru
        HinhTru htr = new HinhTru();
        htr.xuatTen();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.inTheTich();


        //hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inTheTich();

        //hinh vuong
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}
