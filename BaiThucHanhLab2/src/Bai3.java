import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) throws Exception 
    {
        String Ten;
        int namSinh;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();

        if((2023 - namSinh) < 16 )
        {
            System.out.printf("Ban %s o do tuoi vi thanh nien", Ten);
        }

        else if((2023 - namSinh) >= 16 && (2023 - namSinh) < 18)
        {
            System.out.printf("Ban %s o do tuoi truong thanh", Ten);
        }

        else
        {
            System.out.printf("Ban %s da gia", Ten);
        }
    }
}
