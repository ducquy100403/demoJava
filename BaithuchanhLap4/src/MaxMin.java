import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("nhập số phần tử của arraylist:");
        int n = sc.nextInt();
        for(int i=0 ; i < n ;i++) {
            System.out.println("nhap phan tu thu" + i + ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        int max, min;
        max = arrListInteger.get(0);
        min = arrListInteger.get(0);
        for( int i = 1; i < arrListInteger.size(); i++){
            if ( arrListInteger.get(i).compareTo(max)>0){
                max= arrListInteger.get(i);
            }
            if(arrListInteger.get(i).compareTo(max)>0)
            {
                max = arrListInteger.get(i);
            }
            if(arrListInteger.get(i).compareTo(min)<0)
            {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrListInteger = " +max);
    }
}
