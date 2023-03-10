import java.util.Scanner;
public class App {
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

        // sap xep cac phan tu trong mang
        for(int i = 0; i < ktpt - 1; i++)
        {
            int c;
            for(int j = i + 1; j < ktpt; j++)
            {
                if (arr[i] > arr[j] )
                {
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }

        System.out.print("\n");
        
        //Sau khi sap xep
        System.out.print("Cac phan tu trong mang sau khi sap xep la: ");
        for(int i = 0; i < ktpt; i++)
        {
            System.out.print(arr[i] + " ");
        }



    }
}