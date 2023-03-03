import java.util.Scanner;

public class Slide30
{
	
	public static void main(String[] args) 
	{
	    int n, Tong;
	    Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong n: ");
		n = sc.nextInt();
		Tong = 0;
		while(n > 0)
		{
		    
		    Tong = Tong + n % 10;
		    n = n / 10;
		    
		}
		
		System.out.print("Tong cac chu so vua nhap la: ");
		System.out.print(Tong);
	}
}
