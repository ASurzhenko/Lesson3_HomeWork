/**
 * Created by Александр on 18.02.2016.
 */
//Найти все счастливые билеты от 100000 до 999999

public class HomeWork8 {
    public static void main(String[] args) {

        int sum1 = 0, sum2 = 0, n;
        for (int i = 100123; i < 999999; i++) {

            if (i > 999) {
                sum1 += i % 10;
                i /= 10;
            }

        }
        System.out.println(sum1);
    }
}


   /* int n = 345;

    int[] array = new int[3];
    int i = 0;
while (n > 0) {
        array[i++] = n % 10;
        n /= 10;
        }

        for(i = 2; i >= 0; i--) {
        System.out.println(array[i]);*/