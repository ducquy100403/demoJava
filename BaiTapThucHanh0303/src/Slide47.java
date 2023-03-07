import java.util.Scanner;
public class Slide47
{
	public static void main(String[] args) 
	{
		
	int i, tong = 0;
    Scanner sc = new Scanner(System.in);
         
    do 
    {
        System.out.print("Nhap so: ");
        i = sc.nextInt();
        tong += i;
             
        if (tong > 100)
            break;
    } while (i > 0);
         
    System.out.println("Tong cac so vua nhap la: " + tong);
	}
}