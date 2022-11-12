/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34


*/


import java.util.Scanner;

public class Fibonacci {
    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");

        int number = scanner.nextInt();
        int[] array = new int[number];

        array[0] = 0;
        array[1] = 1;

        for (int i = 0; i < number; i++) {
            if (i != 0 && i != 1) {

                array[i] = array[i - 1] + array[i - 2];
                System.out.println(array[i - 2] + "+" + array[i - 1] + "=" + array[i]);
            }


        }
    }
}
