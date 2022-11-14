/*Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
 *
 *
 *
 * -----------------------------------NOT----------------------------
 *  i yerine sayının 1 eksiği girilerek fonksiyon çalıştırılmalıdır.
 *
 *
 *
 *
 *
 * */


public class Prime {
    public static String Recursive_Prime(int number, int i) {
        if (i > 1) {
            if (number % i == 0) {
                return number + " bir asal sayı değildir.";
            }
            return Recursive_Prime(number, i - 1);
        }
        return number + " bir asal sayıdır.";
    }
}
