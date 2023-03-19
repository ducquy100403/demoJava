import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            sum *= i;
        }
        System.out.printf("Giai thua cua so vua nhap la: %d", sum);
    }
    
}
