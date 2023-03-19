import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner sc = new Scanner(System.in);   
         
        System.out.print("Nhap vao so cac so nguyen trong day: ");
        n = sc.nextInt();
        
        for (int i = 1; i <=n; i++) 
        {
            System.out.print("Nhap so thu " + i + ": ");
            number = sc.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung binh cong = " + avgNumber);
    }
    
}
