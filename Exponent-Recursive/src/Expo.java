/*Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.*/





public class Expo {
    public static int Exponantial(int number,int expo) {
        if(expo>0){
            return number*Exponantial(number,expo-1);
        }
        return 1;
    }
}
