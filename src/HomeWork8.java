/**
 * Created by Александр on 18.02.2016.
 */
//Найти все счастливые билеты от 100000 до 999999

public class HomeWork8 {
    public static void main(String[] args) {

        int s = 0, n;

        for (int i = 100000; i <= 999999; i++) {
            int sum1 = 0, sum2 = 0;
            n = i;
            for (; n > 0; n /= 10) {
                if (n > 999) {
                    sum1 += n % 10;
                } else {
                    sum2 += n % 10;
                }
            }
            if (sum1 == sum2) {
                s++;
                System.out.println("Lucky ticket № " + s + " : " + i);
            }
        }
        System.out.println("There are " + s + " lucky tickets!");
    }
}
