/**
 * Created by Александр on 18.02.2016.
 */
/*
Создайте программу, выводящую на экран все неотрицательные
элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class HomeWork3 {
    public static void main(String[] args) {

        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }
    }
}
