/*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.*/



import java.util.Scanner;

public class Triangle {

    public static void Inverse_Triangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j=2*number-1;j>=(2*i+1);j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}