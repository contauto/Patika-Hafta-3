import java.util.Scanner;

public class Uslu_Sayi {
    public static void d() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssünü almak istediğiniz sayıyı giriniz.");
        int sayi = scanner.nextInt();

        System.out.println("Üs olacak sayıyı giriniz.");
        int us = scanner.nextInt();


        double sonuc=1;


        for (int i = 0; i < us; i++) {
            sonuc=sonuc*sayi;
        }


        System.out.println("Sonuç:" + sonuc);
    }
}


