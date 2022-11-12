import java.util.Scanner;

public class Kombinasyon {
    public static void c(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("n'yi giriniz.");
         int n=scanner.nextInt();

        System.out.println("r'yi giriniz.");
        int r=scanner.nextInt();

        double permutasyonN=1;
        double permutasyonR=1;
        double permutasyonN_R=1;

        double sonuc;

        if((n>r)&&(n>4)&&(r>0)){

        for (int i = 1; i < n+1; i++) {
        permutasyonN=permutasyonN*i;
        }

        for (int i = 1; i < r+1; i++) {
            permutasyonR=permutasyonR*i;
        }

        for (int i = 1; i < n-r+1; i++) {
            permutasyonN_R=permutasyonN_R*(i);
        }

        sonuc=permutasyonN/(permutasyonN_R*permutasyonR);

        System.out.println("Sonuç:"+sonuc);}
        else {
            System.out.println("Hatalı giriş.");
        }
    }
}
