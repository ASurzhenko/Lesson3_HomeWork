/**
 * Created by Александр on 18.02.2016.
 */
//Найти минимальный и максимальный элемент массива

public class HomeWork6 {
    public static void main(String[] args) {


        int[] array = {3, 5, 1, 9, 56, 33, 14, -6, 0};
        int size = array.length;
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
