import java.util.Scanner;
public class Bai9 
{
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
        int demThuong = 0;
        int demHoa = 0;
             
        System.out.print("Nhap vao chuoi ki tu: ");
        chuoi = sc.nextLine();
         
        // dem so ky tu thuong va hoa
        for (int i = 0; i < chuoi.length(); i++) {
            
            kyTu = chuoi.charAt(i);
              
            if(kyTu >= 'a' && kyTu <= 'z')
            {
                demThuong++;
            }
            else
            {
                demHoa++;
            }
        }
        System.out.printf("So ky tu thuong la: %d, so ky tu hoa la: %d", demThuong, demHoa);
    }    
}
