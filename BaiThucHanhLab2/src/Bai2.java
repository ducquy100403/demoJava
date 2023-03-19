import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) throws Exception  
    {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 1 so: ");
        a = sc.nextInt();

        //Kiem tra
        if(a % 2 == 0)
        {
            System.out.println("So vua nhap la so chan");
        }

        else
        {
            System.out.println("So vua nhap la so le");
        }
    }   
}
