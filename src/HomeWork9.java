import java.util.Scanner;

/**
 * Created by Александр on 19.02.2016.
 */
//Перевести число в двоичную систему счисления

public class HomeWork9 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();

        int[] array = new int[50];
        int i = 0;
        for (; number > 0; i++) {
            array[i] = number % 2;
            number /= 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(array[j]);
        }
    }
}
