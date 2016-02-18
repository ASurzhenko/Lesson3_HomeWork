import java.util.Scanner;

/**
 * Created by Александр on 18.02.2016.
 */

//Найти сумму всех четных и сумму всех нечетных элементов массива

public class HomeWork7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int sumEvent = 0, sumNotEvent = 0;
        int a;
        int[] array = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            a = scanner.nextInt();
            array[i] = a;
        }

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sumEvent += array[i];
            } else {
                sumNotEvent += array[i];
            }
        }
        System.out.println("Sum of event numbers is " + sumEvent);
        System.out.println("Sum of not event numbers is " + sumNotEvent);
    }
}
