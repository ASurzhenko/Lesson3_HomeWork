import java.util.Scanner;

/**
 * Created by Александр on 18.02.2016.
 */

//Найти сумму первых n элементов массива
public class HomeWork5 {
    public static void main(String[] args) {

        int a, b;
        int sum = 0;
        int size = 10;
        int[] array = new int[size];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for (int i = 0; i < size; i++) {
            a = scanner.nextInt();
            array[i] = a;
        }
        System.out.println("How much elements do you want to add?");

        b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the first " + b + " elements is " + sum);
    }
}