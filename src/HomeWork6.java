import java.util.Scanner;

/**
 * Created by Александр on 18.02.2016.
 */
//Найти минимальный и максимальный элемент массива

public class HomeWork6 {
    public static void main(String[] args) {

        int a;
        int size = 10;
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for (int i = 0; i < size; i++) {
            a = scanner.nextInt();
            array[i] = a;
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);
    }
}
