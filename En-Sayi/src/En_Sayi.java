/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.*/



import java.util.Arrays;
import java.util.Scanner;

public class En_Sayi {
    public static void BiggestAndSmallest(){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Kaç tane sayı gireceksiniz?");
    int howMany = scanner.nextInt();
    int[] numbers=new int[howMany];
    int small,big;

        for (int i = 0; i < howMany; i++) {
            System.out.println(i+1+". sayıyı giriniz.");
            numbers[i]=scanner.nextInt();
        }

        small= Arrays.stream(numbers).min().getAsInt();
        big= Arrays.stream(numbers).max().getAsInt();

        System.out.println("En büyük sayı:"+big);
        System.out.println("En küçük sayı:"+small);
}

}
