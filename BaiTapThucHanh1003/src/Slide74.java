import java.util.Scanner;
public class Slide74 {
    public static void main(String[] args) throws Exception 
    {
        int ktpt;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap so phan tu trong mang: ");
            ktpt = sc.nextInt();
        }while(ktpt <= 0);
        int arr[] = new int[ktpt];
        //Nhap phan tu vao trong mang
        for(int i = 0; i < ktpt; i++)
        {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        //in cac phan tu trong mang 
        System.out.print("Cac phan tu trong mang vua nhap la: ");
        for(int i = 0; i < ktpt; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Tinh tong cac so chan trong mang
        int tong = 0;
        for(int i = 0; i < ktpt - 1; i++)
        {
            if(arr[i] % 2 == 0)
            {
                tong += arr[i];
            }
        }

        System.out.print("\n");
        
        //In tong cac phan tu chan trong mang
        System.out.print("Tong cac phan tu chan trong mang la: " + tong);
        



    }
}