/**
 * Created by Александр on 18.02.2016.
 */
/*
Создайте программу, выводящую на экран первые 20 элементов
последовательности 2 4 8 16 32 64 128 ….
 */
public class HomeWork4 {
    public static void main(String[] args) {

        for (int digit = 2, i = 0; i < 20; i++) {
            System.out.print(digit + " ");
            digit += digit;
        }
    }
}
