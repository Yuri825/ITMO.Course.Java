// Написать итератор по массиву (одномерному, потом обобщить до двумерного)

package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main
{

    public static void main(String[] args)
    {
        // одномерный массив
        int[] arr1 = new int[]{3, 6, 2, 5, 7};

        Iterator<Integer> iter1 = Arrays.stream(arr1).iterator();

        while (iter1.hasNext()) {
            System.out.println("элемент одномерного массива: " + iter1.next());
        }
        System.out.println("\n==================================================================================\n");
        // двумерный массив
        int[][] arr2 = new int[][]{{5, 3, 8}, {3, 1, 9, 4}, {4, 2, 7}};
        ArrayIterator iter2 = new ArrayIterator(arr2);
        while (iter2.hasNext()) {
            System.out.println("элемент двумерного массива: " + iter2.next());
        }

    }
}
