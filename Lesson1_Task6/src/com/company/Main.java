// Дан массив чисел и число. Удалите все вхождения числа в массив (пропусков
//быть не должно).

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int array [] = new int[] {1, 5, 3, 4, 5};
        System.out.println("Массив до удаления: ");
	    for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int num = scanner.nextInt();

        int numDelete = 0; // Определяем число для подсчета количества удаляемых элементов

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == num)
            {
                numDelete++;
            }
        }

        //Определяем новый массив с количеством элементов, соответствующим старому массиву минус удаленные элементы:
        int newArray[] = new int[array.length-numDelete];

        for (int i = 0, a = 0; i < array.length; i++)
        {
            if (array[i] != num)
            {
                newArray[a] = array[i];
                a++;
            }
        }

        System.out.println("Массив после удаления: ");
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i]);
        }
    }
}
