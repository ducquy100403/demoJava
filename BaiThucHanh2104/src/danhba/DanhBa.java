package danhba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class test {
    static List<DanhBa> list = new ArrayList<DanhBa>();
    static void init()
    {
        list.add(new DanhBa("Duc Quy", "0862879616"));
        list.add(new DanhBa("Xuan Huy", "0862879878"));
    }
    static void print()
    {
        System.out.println("\n Danh sach  so dien thoai: ");
        System.out.println(String.format("%30s %15s","Ten", "So dien thoai"));
        for(DanhBa soDT : list)
        {
            System.out.println(soDT);
        }
    }

    static void timSoDT(String PhoneNumber)
    {
        System.out.println(String.format("%30s %15s", "Ten", "So dien Thoai "));
        for(DanhBa soDT : list)
        {
            if(soDT.getPhoneNumber().equals(PhoneNumber))
            {
                System.out.println(soDT);
            }
        }
    }

    static void timTen(String Address)
    {
        System.out.println("\n Danh sach  so dien thoai: ");
        System.out.println(String.format("%30s %15s","Ten", "So dien thoai"));
        for(DanhBa soDT : list)
        {
            System.out.println(soDT);
        }
    }
   public static void main(String[] args) 
   {
        init();
        print();
        timSoDT("0862879616");
        timTen("Duc Quy");
    }
}
