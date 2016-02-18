/**
 * Created by Александр on 18.02.2016.
 */
//Найти минимальный и максимальный элемент массива

public class HomeWork6 {
    public static void main(String[] args) {

        int size = 9;
        int[] Array = {3, 5, 1, 9, 56, 33, 14, -6, 0};
        int max = Array[0];
        int min = Array[0];

        for (int i = 0; i < size; i++) {
            System.out.print(Array[i] + " ");
            if (Array[i] > max) {
                max = Array[i];
            }
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        System.out.println();
        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);
    }
}
