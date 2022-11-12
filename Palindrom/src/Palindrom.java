import java.util.Scanner;

public class Palindrom {
    public static void j() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Sayıyı giriniz.");
        String tersSayi="";
        String sayi = scanner.next();
        StringBuilder stringBuilder=new StringBuilder(sayi);


        for (int i = 0; i<sayi.length(); i++) {
            stringBuilder.setCharAt((sayi.length()-i-1),sayi.charAt(i));
            tersSayi=stringBuilder.toString();
        }

        if(tersSayi.equals(sayi)) {
            System.out.println(sayi+" bir palindromik sayıdır.");
        }
        else{
            System.out.println(sayi+" bir palindromik sayı değildir.");
        }

    }
}
