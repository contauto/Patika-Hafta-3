import java.util.Scanner;

public class Ebob_Ekok {
    public static void i(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");
        int sayi1 = scanner.nextInt();

        System.out.println("Diğer sayıyı giriniz.");
        int sayi2 = scanner.nextInt();

        int ebob=1,ekok,i=1;

        if(sayi1>=sayi2){
            while(i<=sayi1){
                if((sayi1%i==0)&&(sayi2%i==0)){
                    ebob=i;
                }
                i++;
            }
        }
        else{
            while(i<=sayi2){
            if((sayi1%i==0)&&(sayi2%i==0)){
                ebob=i;
            }
            i++;
        }

        }

        ekok=sayi1*sayi2/ebob;

        System.out.println("EBOB:"+ebob);
        System.out.println("EKOK:"+ekok);


}
}
