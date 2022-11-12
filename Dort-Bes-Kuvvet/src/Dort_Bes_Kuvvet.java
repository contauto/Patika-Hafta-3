import java.util.Scanner;

public class Dort_Bes_Kuvvet {
    public static void b(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");

        double dordunKuvveti=1;
        double besinKuvveti=1;

        int girilenSayi=scanner.nextInt();
        for (int i = 0; i < girilenSayi; i++) {
            dordunKuvveti=dordunKuvveti*4;
            besinKuvveti=besinKuvveti*5;
        }
        System.out.println("4^x:"+dordunKuvveti);
        System.out.println("5^x:"+besinKuvveti);
    }
}
