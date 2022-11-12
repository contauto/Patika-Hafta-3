import java.util.Scanner;

public class Harmonik_Seri {
    public static void f() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harmonik seri için bir sayı giriniz.");
        double sayi = scanner.nextDouble();



        double sonuc=0;


        for (double i = 1; i < sayi+1; i++) {
            sonuc=sonuc+(1/i);
        }


        System.out.println("Sonuç:" + sonuc);
    }
}
