import java.util.Scanner;

public class Dordun_Kati {
    public static void a(){
        int girilenSayi;
        int toplam=0;
        int i=0;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println(i+1+".sayınızı giriniz.");
            girilenSayi=scanner.nextInt();
            i++;
            if(girilenSayi%4==0){
                toplam=toplam+girilenSayi;
            }
            else if(girilenSayi%2!=0){
                System.out.println("Toplam : "+toplam);
                break;
            }
        }
    }
}
