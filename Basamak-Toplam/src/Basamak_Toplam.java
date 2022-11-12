import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basamak_Toplam {
    public static void e() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamaklarını toplamak istediğiniz sayıyı giriniz.");
        int sayi = scanner.nextInt();
        List<Integer> list = new ArrayList<>();


        double sonuc=0;


        while (sayi > 0) {
        sonuc=sonuc+(sayi%10);
        sayi=sayi/10;
        }




        System.out.println("Sonuç:" + sonuc);
    }
}
