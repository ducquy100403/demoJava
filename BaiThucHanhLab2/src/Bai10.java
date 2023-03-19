import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) throws Exception 
    {
        String chuoi;
        char kyTu;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap vao chuoi ki tu: ");
            chuoi = sc.nextLine();
        }while(chuoi.length() > 80);
        
        // tim so lan xuat hien cua ky tu do
        System.out.print("Nhap vao ky tu can dem: ");
        kyTu  = sc.next().charAt(0);
        for(int i = 0; i < chuoi.length(); i++)
        {
            if(kyTu == chuoi.charAt(i))
            {
                dem++;
            }
        }
        System.out.printf("Ky tu %c xuat hien %d lan ", kyTu, dem);
    }
}