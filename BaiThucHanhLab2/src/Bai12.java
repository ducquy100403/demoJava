import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) throws Exception 
    {   
        int soHang, soCot;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap so hang: ");
            soHang = sc.nextInt();
            System.out.print("Nhap so cot: ");
            soCot = sc.nextInt();

        }while(soHang <= 0 || soCot <= 0);
        int arr[][] = new int[soHang][soCot];

        System.out.print("Nhap mang:\n");
        for(int i = 0; i < soHang; i++)
        {
            for(int j = 0; j < soCot; j++)
            {
                System.out.printf("arr[%d][%d]: ", i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        // in ra mang 2 chieu
        for(int i = 0; i < soHang; i++)
        {
            for(int j = 0; j < soCot; j++)
            {
                System.out.printf("%d ", arr[i][j]);
                
            }
            System.out.print("\n");
        }
        
        // Tim phan tu lon nhat
        int max = arr[0][0];
        for(int i = 0; i < soHang; i++)
        {
            for(int j = 0; j < soCot; j++)
            {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                
            }   
        }
        System.out.print("Phan tu lon nhat trong mang vua nhap la: " + max);
    }
}
