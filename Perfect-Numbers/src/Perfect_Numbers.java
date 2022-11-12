/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/



import java.util.Scanner;

public class Perfect_Numbers {
   public static void Perfect_Number_Finder(){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Bir sayı giriniz.");
      int number=scanner.nextInt();
      int addition=0;

      for (int i = 1; i < number; i++) {
         if(number%i==0){
            addition=addition+i;
         }
      }
      if(addition==number){
         System.out.println(number+" sayısı mükemmel sayıdır.");
      }
      else {
         System.out.println(number+" sayısı mükemmel sayı değildir");
      }
   }
}
