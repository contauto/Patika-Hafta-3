/*Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/
public class Prime_Number {
    public static void Calculator() {
        int counter=0;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i ; j++) {
                if (i%j==0){
                    counter++;
                }

            }
            if (counter==0){
                System.out.print(i+" ");
            }

            counter=0;
        }

}}
