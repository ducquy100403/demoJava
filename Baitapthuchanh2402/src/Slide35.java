import java.lang.Math;
import java.util.Scanner;
public class Slide35
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int a, b;
	    System.out.print("Nhap 2 so a va b: ");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    System.out.print(Math.min(a, b));
		
	}
}