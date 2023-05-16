import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
         // them phan tu
        treeSetInteger.add(0);
        treeSetInteger.add(8);
        treeSetInteger.add(2);
        treeSetInteger.add(4);
        treeSetInteger.add(1);
        treeSetInteger.add(3);
        System.out.println("cac phan tu trong treset la: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu muon them");
        number = sc.nextInt();
        //them phan tu new
        if(!treeSetInteger.contains(number))
        {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu moi sau khi them");
            System.out.println(treeSetInteger);
        }
        else
        {
            System.out.println("Phan tu" + number + "da ton tai");
        }
    }
    
}
