import java.util.Scanner;

public class Yildizlarla_Elmas {
    public static void g() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int sayi = scanner.nextInt();


        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j<sayi-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i+1 ; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*sayi-(2*i-1) ; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
