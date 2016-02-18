import java.util.Scanner;

/**
 * Created by Александр on 18.02.2016.
 */

//Найти сумму первых n элементов массива
public class HomeWork5 {
    public static void main(String[] args) {

        int a;
        int sum = 0;
        int[] Array = {3, 5, 1, 9, 56, 33, 14, -6, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much elements do you want to add?");

        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            sum += Array[i];
        }
        System.out.println("Sum of the first " + a + " elements is " + sum);
    }
}