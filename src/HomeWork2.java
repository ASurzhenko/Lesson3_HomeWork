/**
 * Created by Александр on 18.02.2016.
 */
/*
Создайте программу, выводящую на экран первые 55 элементов
последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class HomeWork2 {
    public static void main(String[] args) {

        for (int digit = 1, i = 0; i < 55; i++) {
            System.out.print(digit + " ");
            digit += 2;
        }
    }
}
