import java.util.Scanner;
public class Bai5
{
	public static void main(String[] args) 
	{
		
	int i, tong = 0;
    Scanner sc = new Scanner(System.in);
     
    while (tong < 100)
    {
        System.out.print("Nhap so: ");
        i = sc.nextInt();    
        tong += i;
             
        if (tong > 100)
            break;
    } 
         
    System.out.println("Tong cac so vua nhap la: " + tong);
	}
}