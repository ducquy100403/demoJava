import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) throws Exception  
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap so b: ");
        b = sc.nextFloat();
        //1.
        //Tinh tong
        System.out.printf("Tong 2 so vua nhap la: %f\n", (a + b));
        //Tinh hieu
        System.out.printf("Hieu 2 so vua nhap la: %f\n", (a - b));
        //Tinh tich
        System.out.printf("Tich 2 so vua nhap la: %f\n", (a * b));
        //Tinh thuong
        System.out.printf("Thuong 2 so vua nhap la: %f\n", (a / b));
        //Chia lay phan du
        System.out.printf("Phan du 2 so vua nhap la: %f\n", (a % b));

        //2.
        System.out.println("a lon hon b la: ");
        System.out.println( a > b);
        System.out.println("a nho hon b la: ");
        System.out.println( a < b);
        System.out.println("a bang  b la: ");
        System.out.println( a == b);



    }
}

