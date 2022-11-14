/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

*/


public class Rec {
    public static int Recursive(int number, int sameNumber, String process) {
        if ((number > 0) && (process.equals("-"))) {
            System.out.print(number + " ");
            number = number - 5;
            if (number <= 0) {
                process = "+";
            }
            return Recursive(number, sameNumber, process);
        } else {
            System.out.print(number + " ");
            number = number + 5;
            if (number == sameNumber) {
                System.out.print(number + " ");
                return 0;
            } else {
                Recursive(number, sameNumber, "+");
            }
        }
        return 0;
    }
}
